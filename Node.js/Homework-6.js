const Koa = require("koa");

const app = new Koa();
const PORT = 3000;

app.use((ctx) => {
  switch (ctx.path) {
    case "/":
      ctx.type = "text/html";
      ctx.status = 200;
      ctx.body = "<h1>INDEX SAYFASI</h1>";
      break;
    case "/about":
      ctx.type = "text/html";
      ctx.status = 200;
      ctx.body = "<h1>ABOUT SAYFASI</h1>";
      break;
    case "/contact":
      ctx.type = "text/html";
      ctx.status = 200;
      ctx.body = "<h1>CONTACT SAYFASI</h1>";
      break;
    default:
      ctx.type = "text/html";
      ctx.status = 404;
      ctx.body = "<h1>404 SAYFA BULUNAMADI</h1>";
  }
});

app.listen(PORT, () => {
  console.log(`PORT: ${PORT}`);
});
