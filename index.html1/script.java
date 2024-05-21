const dialog = document.getElementById('dialog');
const choiceInput = document.getElementById('choice');
const undertaleAudio = document.getElementById('undertale-audio');
const playMusicButton = document.getElementById('play-music');

playMusicButton.addEventListener('click', function() {
  undertaleAudio.play();
});

choiceInput.addEventListener('keypress', function (e) {
  if (e.key === 'Enter') {
    const choice = choiceInput.value.toLowerCase();
    choiceInput.value = '';
    updateDialog(choice);
  }
});

function updateDialog(choice) {
  if (choice === 'u') {
    dialog.innerHTML = `
      <p><strong>Фриск:</strong> "Спасибо за помощь."</p>
      <p><strong>Ториэль:</strong> "Ты такой добрый. Пойдем, я покажу тебе, как здесь выжить."</p>
      <p>Ториэль ведёт вас через Руины, объясняя правила и показывая, как решать головоломки.</p>
      <p><strong>Сцена 2: Встреча с Сансом и Папирусом</strong></p>
      <p>Вы выходите из Руин и встречаете Санса и Папируса.</p>
      <p class="sans"><strong>Санс:</strong> "Эй, человечек, как дела?"</p>
      <p class="papyrus"><strong>Папирус:</strong> "СТОЙ! ЧЕЛОВЕК! ТЫ БУДЕШЬ МОИМ ЗАТАЧНИКОМ!"</p>
      <p><strong>(u) Пощадить</strong></p>
      <p><strong>(t) Напасть</strong></p>
    `;
  } else if (choice === 't') {
    dialog.innerHTML = `
      <p>Фриск атакует Ториэль. Ториэль, раненая, защищается, но не хочет вам навредить.</p>
      <p><strong>Ториэль:</strong> "Почему ты это делаешь? Я просто хотела помочь!"</p>
      <p><strong>Сцена 2: Встреча с Сансом и Папирусом</strong></p>
      <p>Вы выходите из Руин и встречаете Санса и Папируса.</p>
      <p class="sans"><strong>Санс:</strong> "Эй, человечек, как дела?"</p>
      <p class="papyrus"><strong>Папирус:</strong> "СТОЙ! ЧЕЛОВЕК! ТЫ БУДЕШЬ МОИМ ЗАТАЧНИКОМ!"</p>
      <p><strong>(u) Пощадить</strong></p>
      <p><strong>(t) Напасть</strong></p>
    `;
  } else if (choice === 'u' && dialog.innerHTML.includes("Санс")) {
    dialog.innerHTML = `
      <p><strong>Фриск:</strong> "Привет, Санс, Папирус. Я не хочу причинять вреда."</p>
      <p class="sans"><strong>Санс:</strong> "Ну, это хорошо. Мы все можем быть друзьями."</p>
      <p class="papyrus"><strong>Папирус:</strong> "ДА! ДРУЗЬЯ!"</p>
      <p><strong>Сцена 3: Встреча с Меттатоном</strong></p>
      <p>Вы находитесь в Королевстве, и перед вами появляется Меттатон.</p>
      <p><strong>Меттатон:</strong> "Ах, если это не наш звездный гость! Готов к шоу?"</p>
      <p><strong>(u) Пощадить</strong></p>
      <p><strong>(t) Напасть</strong></p>
    `;
  } else if (choice === 't' && dialog.innerHTML.includes("Санс")) {
    dialog.innerHTML = `
      <p>Фриск атакует Санса и Папируса. Санс уклоняется от атак, а Папирус защищается.</p>
      <p class="sans"><strong>Санс:</strong> "Ну что ж, если так..."</p>
      <p class="papyrus"><strong>Папирус:</strong> "ПОЧЕМУ, ЧЕЛОВЕК?! Я ПРОСТО ХОЧУ ДРУЖИТЬ!"</p>
      <p><strong>Сцена 3: Встреча с Меттатоном</strong></p>
      <p>Вы находитесь в Королевстве, и перед вами появляется Меттатон.</p>
      <p><strong>Меттатон:</strong> "Ах, если это не наш звездный гость! Готов к шоу?"</p>
      <p><strong>(u) Пощадить</strong></p>
      <p><strong>(t) Напасть</strong></p>
    `;
  } else if (choice === 'u' && dialog.innerHTML.includes("Меттатон")) {
    dialog.innerHTML = `
      <p><strong>Фриск:</strong> "Я не хочу драться."</p>
      <p><strong>Меттатон:</strong> "Ах, какой милый жест! Но шоу должно продолжаться!"</p>
      <p>Меттатон уходит, оставив вас в безопасности.</p>
      <p><strong>Сцена 4: Встреча с Азгордом</strong></p>
      <p>Вы подходите к трону короля монстров — Азгорда.</p>
      <p><strong>Азгорд:</strong> "Ты пришёл так далеко, человек. Готов к последнему испытанию?"</p>
      <p><strong>(u) Пощадить</strong></p>
      <p><strong>(t) Напасть</strong></p>
    `;
  } else if (choice === 't' && dialog.innerHTML.includes("Меттатон")) {
    dialog.innerHTML = `
      <p>Фриск атакует Меттатона. Меттатон отражает атаку, превращаясь в свою боевую форму.</p>
      <p><strong>Меттатон:</strong> "О, так ты хочешь драмы! Ну, давай покажем тебе настоящее шоу!"</p>
      <p><strong>Сцена 4: Встреча с Азгордом</strong></p>
      <p>Вы подходите к трону короля монстров — Азгорда.</p>
      <p><strong>Азгорд:</strong> "Ты пришёл так далеко, человек. Готов к последнему испытанию?"</p>
      <p><strong>(u) Пощадить</strong></p>
      <p><strong>(t) Напасть</strong></p>
    `;
  } else if (choice === 'u' && dialog.innerHTML.includes("Азгорд")) {
    dialog.innerHTML = `
      <p><strong>Фриск:</strong> "Я не хочу драться, Азгорд."</p>
      <p><strong>Азгорд:</strong> "Ты действительно особенный человек. Ты прошёл через всё это и сохранил доброту в сердце."</p>
      <p>Азгорд отпускает вас, и вы на пути к свободе.</p>
      <p><strong>Финальная Сцена: Встреча с Флауи</strong></p>
      <p>Вы подходите к выходу из Подземелья, и перед вами появляется Флауи, превратившийся в огромное существо.</p>
      <p><strong>Флауи:</strong> "Ты думаешь, ты можешь уйти так просто? Я — последний, кто стоит на твоём пути!"</p>
      <p><strong>(u) Пощадить</strong></p>
      <p><strong>(t) Напасть</strong></p>
    `;
  } else if (choice === 't' && dialog.innerHTML.includes("Азгорд")) {
    dialog.innerHTML = `
      <p>Фриск атакует Азгорда. Азгорд принимает бой, но показывает уважение к вашей силе.</p>
      <p><strong>Азгорд:</strong> "Если ты действительно хочешь этого, я не буду сдерживаться."</p>
      <p><strong>Финальная Сцена: Встреча с Флауи</strong></p>
      <p>Вы подходите к выходу из Подземелья, и перед вами появляется Флауи, превратившийся в огромное существо.</p>
      <p><strong>Флауи:</strong> "Ты думаешь, ты можешь уйти так просто? Я — последний, кто стоит на твоём пути!"</p>
      <p><strong>(u) Пощадить</strong></p>
      <p><strong>(t) Напасть</strong></p>
    `;
  } else if (choice === 'u' && dialog.innerHTML.includes("Флауи")) {
    dialog.innerHTML = `
      <p><strong>Фриск:</strong> "Флауи, я прощаю тебя."</p>
      <p><strong>Флауи:</strong> "Что? Ты правда меня прощаешь? Но почему? Я сделал так много плохого..."</p>
      <p>Флауи смягчается и трансформируется обратно в обычный цветок. Все монстры освобождены.</p>
      <p>Концовка: Хорошая. Вы освободили всех монстров и вернулись на поверхность.</p>
    `;
  } else if (choice === 't' && dialog.innerHTML.includes("Флауи")) {
    dialog.innerHTML = `
      <p>Фриск атакует Флауи, проходя через его оборону и уничтожая его.</p>
      <p><strong>Флауи:</strong> "Ты действительно безжалостен. Но, возможно, это и есть твоя истинная природа..."</p>
      <p>Вы выходите из Подземелья в одиночестве, покрытые кровью ваших врагов.</p>
      <p>Концовка: Плохая. Вы убили всех и ушли в одиночество.</p>
    `;
  }
}
