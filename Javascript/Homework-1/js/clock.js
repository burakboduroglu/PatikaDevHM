function time() {
  const date = new Date();
  let day = date.getUTCDay();
  let h = date.getHours();
  let m = date.getMinutes();
  let s = date.getSeconds();

  switch (day) {
    case 0:
      day = "Pazar";
      break;
    case 1:
      day = "Pazartesi";
      break;
    case 2:
      day = "Salı";
      break;
    case 3:
      day = "Çarşamba";
      break;
    case 4:
      day = "Perşembe";
      break;
    case 5:
      day = "Cuma";
      break;
    case 6:
      day = "Cumartesi";
      break;
    default:
      day = "Hatalı Gün";
      break;
  }
  let clock = `
<p>${h}:${m}:${s} <strong>${day}</strong></p>
`;

  let clockElement = document.querySelector("#myClock");
  clockElement.innerHTML = clock;
}

let takeName = prompt("Adınızı giriniz: ");
let nameElement = document.querySelector("#myName");
nameElement.innerHTML = takeName;
setInterval(time);


