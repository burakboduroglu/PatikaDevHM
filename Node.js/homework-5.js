const http = require("http");
const PORT = 5000;

const server = http.createServer((req, res) => {
  const URL = req.url;
  if (URL === "/") {
    res.writeHead(200, { "Content-Type": "text/html" });
    res.write("<h2>... SAYFASINA HOS GELDINIZ.</h2>");
  }
  else if (URL === '/hakkimda'){
    res.writeHead(200, {'Content-Type': 'text/html'})
    res.write("<h2>... SAYFASINA HOS GELDINIZ.</h2>");
  }
  else if (URL === '/iletisim'){
    res.writeHead(200, {'Content-Type': 'text/html'})
    res.write("<h2>... SAYFASINA HOS GELDINIZ.</h2>");
  }
  else{
    res.writeHead(200, {'Content-Type': 'text/html'})
    res.write("<h2>404 SAYFA BULUNAMADI</h2>");
  }
});

server.listen(PORT, () => {
    console.log(`Sunucu port ${PORT} de başlatıldı.`);
})
