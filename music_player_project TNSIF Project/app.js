// app.js
const songs = [
  {
    "id": 1,
    "title": "Track 1",
    "artist": "Artist 1",
    "file": "assets/songs/song1.wav",
    "image": "assets/images/cover1.svg",
    "favorite": false
  },
  {
    "id": 2,
    "title": "Track 2",
    "artist": "Artist 2",
    "file": "assets/songs/song2.wav",
    "image": "assets/images/cover2.svg",
    "favorite": false
  },
  {
    "id": 3,
    "title": "Track 3",
    "artist": "Artist 3",
    "file": "assets/songs/song3.wav",
    "image": "assets/images/cover3.svg",
    "favorite": false
  },
  {
    "id": 4,
    "title": "Track 4",
    "artist": "Artist 4",
    "file": "assets/songs/song4.wav",
    "image": "assets/images/cover4.svg",
    "favorite": false
  },
  {
    "id": 5,
    "title": "Track 5",
    "artist": "Artist 5",
    "file": "assets/songs/song5.wav",
    "image": "assets/images/cover5.svg",
    "favorite": false
  },
  {
    "id": 6,
    "title": "Track 6",
    "artist": "Artist 6",
    "file": "assets/songs/song6.wav",
    "image": "assets/images/cover6.svg",
    "favorite": false
  },
  {
    "id": 7,
    "title": "Track 7",
    "artist": "Artist 7",
    "file": "assets/songs/song7.wav",
    "image": "assets/images/cover7.svg",
    "favorite": false
  },
  {
    "id": 8,
    "title": "Track 8",
    "artist": "Artist 8",
    "file": "assets/songs/song8.wav",
    "image": "assets/images/cover8.svg",
    "favorite": false
  },
  {
    "id": 9,
    "title": "Track 9",
    "artist": "Artist 9",
    "file": "assets/songs/song9.wav",
    "image": "assets/images/cover9.svg",
    "favorite": false
  },
  {
    "id": 10,
    "title": "Track 10",
    "artist": "Artist 10",
    "file": "assets/songs/song10.wav",
    "image": "assets/images/cover10.svg",
    "favorite": false
  }
];


let currentIndex = 0;
const audio = document.getElementById('audio');
const playBtn = document.getElementById('play');
const prevBtn = document.getElementById('prev');
const nextBtn = document.getElementById('next');
const seek = document.getElementById('seek');
const volume = document.getElementById('volume');
const nowTitle = document.getElementById('now-title');
const nowArtist = document.getElementById('now-artist');
const cover = document.getElementById('cover');
const currentTimeEl = document.getElementById('current');
const durationEl = document.getElementById('duration');
const playlistEl = document.getElementById('playlist');
const recentEl = document.getElementById('recent');
const favEl = document.getElementById('favorites');
const searchInput = document.getElementById('search');
const voiceBtn = document.getElementById('voice');
const shuffleBtn = document.getElementById('shuffle');
const repeatBtn = document.getElementById('repeat');

let isPlaying = false;
let isShuffle = false;
let isRepeat = false;

function loadSong(index){
  const s = songs[index];
  audio.src = s.file;
  nowTitle.textContent = s.title;
  nowArtist.textContent = s.artist;
  cover.src = s.image;
  updateActiveInList();
}

function playSong(){
  audio.play();
  isPlaying = true;
  playBtn.textContent = '⏸';
  addToRecentlyPlayed(songs[currentIndex]);
}

function pauseSong(){
  audio.pause();
  isPlaying = false;
  playBtn.textContent = '▶️';
}

playBtn.addEventListener('click', () => {
  isPlaying ? pauseSong() : playSong();
});

prevBtn.addEventListener('click', () => {
  if(isShuffle){
    currentIndex = Math.floor(Math.random()*songs.length);
  } else {
    currentIndex = (currentIndex - 1 + songs.length) % songs.length;
  }
  loadSong(currentIndex);
  playSong();
});

nextBtn.addEventListener('click', () => {
  nextTrack();
});

function nextTrack(){
  if(isRepeat){
    // same index
  } else if(isShuffle){
    currentIndex = Math.floor(Math.random()*songs.length);
  } else {
    currentIndex = (currentIndex + 1) % songs.length;
  }
  loadSong(currentIndex);
  playSong();
}

audio.addEventListener('timeupdate', () => {
  if(audio.duration){
    const progress = (audio.currentTime / audio.duration) * 100;
    seek.value = progress;
    currentTimeEl.textContent = formatTime(audio.currentTime);
    durationEl.textContent = formatTime(audio.duration);
  }
});

seek.addEventListener('input', () => {
  if(audio.duration){
    audio.currentTime = (seek.value / 100) * audio.duration;
  }
});

volume.addEventListener('input', () => {
  audio.volume = volume.value;
});

audio.addEventListener('ended', () => {
  nextTrack();
});

function formatTime(sec){
  if(!sec || isNaN(sec)) return '0:00';
  const m = Math.floor(sec/60);
  const s = Math.floor(sec%60).toString().padStart(2,'0');
  return `${m}:${s}`;
}

// Playlist rendering
function renderPlaylist(filter=''){
  playlistEl.innerHTML = '';
  songs.forEach((s, idx) => {
    if(filter && !s.title.toLowerCase().includes(filter.toLowerCase())) return;
    const div = document.createElement('div');
    div.classList.add('track');
    div.innerHTML = `
      <img src="${s.image}" alt="${s.title}">
      <div class="meta">
        <div class="t">${s.title}</div>
        <div class="a">${s.artist}</div>
      </div>
      <div class="actions">
        <div class="small">⏱</div>
        <div class="fav" data-id="${s.id}">${s.favorite ? '★' : '☆'}</div>
      </div>
    `;
    div.addEventListener('click', (e) => {
      if(e.target.classList.contains('fav')){
        toggleFavorite(parseInt(e.target.dataset.id));
        return;
      }
      currentIndex = idx;
      loadSong(currentIndex);
      playSong();
    });
    playlistEl.appendChild(div);
  });
  updateActiveInList();
}

function updateActiveInList(){
  const children = playlistEl.querySelectorAll('.track');
  children.forEach((el, i) => {
    el.style.background = i===currentIndex ? 'rgba(255,255,255,0.02)' : 'transparent';
  });
}

function loadLocal(){
  const favs = JSON.parse(localStorage.getItem('mp_favorites')||'{}');
  songs.forEach(s => { s.favorite = !!favs[s.id]; });
  renderFavs();
  const rec = JSON.parse(localStorage.getItem('mp_recent')||'[]');
  renderRecents(rec);
}

function addToRecentlyPlayed(song){
  let rec = JSON.parse(localStorage.getItem('mp_recent')||'[]');
  rec = rec.filter(r => r.id !== song.id);
  rec.unshift(song);
  if(rec.length>10) rec.pop();
  localStorage.setItem('mp_recent', JSON.stringify(rec));
  renderRecents(rec);
}

function renderRecents(rec){
  recentEl.innerHTML = '';
  rec.forEach(r => {
    const li = document.createElement('li');
    li.textContent = r.title;
    li.addEventListener('click', ()=> {
      const idx = songs.findIndex(s=>s.id===r.id);
      if(idx>=0){ currentIndex = idx; loadSong(currentIndex); playSong(); }
    });
    recentEl.appendChild(li);
  });
}

function toggleFavorite(id){
  const s = songs.find(x=>x.id===id);
  if(!s) return;
  s.favorite = !s.favorite;
  const favs = JSON.parse(localStorage.getItem('mp_favorites')||'{}');
  if(s.favorite) favs[id]=true; else delete favs[id];
  localStorage.setItem('mp_favorites', JSON.stringify(favs));
  renderPlaylist(searchInput.value);
  renderFavs();
}

function renderFavs(){
  favEl.innerHTML = '';
  songs.filter(s=>s.favorite).forEach(s=>{
    const li = document.createElement('li');
    li.textContent = s.title;
    li.addEventListener('click', ()=> {
      const idx = songs.findIndex(x=>x.id===s.id);
      if(idx>=0){ currentIndex = idx; loadSong(currentIndex); playSong(); }
    });
    favEl.appendChild(li);
  });
}

searchInput.addEventListener('input', ()=> renderPlaylist(searchInput.value));

if('webkitSpeechRecognition' in window || 'SpeechRecognition' in window){
  const Rec = window.SpeechRecognition || window.webkitSpeechRecognition;
  const rec = new Rec();
  rec.lang = 'en-US';
  rec.onresult = (ev) => {
    const text = ev.results[0][0].transcript;
    searchInput.value = text;
    renderPlaylist(text);
  };
  voiceBtn.addEventListener('click', ()=> rec.start());
} else {
  voiceBtn.disabled = true;
  voiceBtn.title = 'Voice search not supported';
}

shuffleBtn.addEventListener('click', ()=> {
  isShuffle = !isShuffle;
  shuffleBtn.style.opacity = isShuffle?1:0.6;
});
repeatBtn.addEventListener('click', ()=> {
  isRepeat = !isRepeat;
  repeatBtn.style.opacity = isRepeat?1:0.6;
});

renderPlaylist();
loadLocal();
loadSong(currentIndex);
audio.volume = 0.8;
