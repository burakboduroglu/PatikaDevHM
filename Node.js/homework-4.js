const fs = require("fs");

fs.writeFile(
  "employees.json",
  '{"name": "Employee 1 Name", "salary": 2000},',
  "utf-8",
  (err) => {
    if (err) {
      console.log(err);
    }
    console.log("DOSYA OLUŞTURULDU");
  }
);

fs.readFile("employees.json", "utf-8", (err, data) => {
  if (err) {
    console.log(err);
  }
  console.log(data);
});

fs.appendFile(
  "./fs-module/employees.json",
  '\n{"name": "Employee 2 Name", "salary": 3000},',
  "utf-8",
  (err) => {
    if (err) {
      console.log(err);
    }
    console.log("DOSYA GÜNCELLENDİ");
  }
);

fs.unlink("employees.json", (err) => {
  if (err) {
    console.log(err);
  }
  console.log("DOSYA SİLİNDİ");
}); 
