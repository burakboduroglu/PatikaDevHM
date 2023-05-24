const blogs = [
  { id: 1, title: "Blog 1", description: "Description 1" },
  { id: 2, title: "Blog 2", description: "Description 2" },
  { id: 3, title: "Blog 3", description: "Description 3" },
];

const showBlogs = () => {
  blogs.forEach((item) => {
    console.log(item.title);
  });
};
showBlogs();
console.log("---------------");

// With callback
const addBlogCallback = (newBlog, callback) => {
  blogs.push(newBlog);
  callback();
};
addBlogCallback({ id: 4, title: 'Blog 4', description: 'Description 4' }, showBlogs)

// With Promise
const addBlogPromise = (newBlog) => {
  const promise = new Promise((resolve, reject) => {
    blogs.push(newBlog);
    resolve(blogs);
  })
    .then(showBlogs())
    .catch((error) => {
      console.log(error);
    });
};

addBlogPromise();

//With ASYNC-WAIT
async function addBlogASYNC(newBlog) {
  try {
    const data = await blogs.push(newBlog);
    showBlogs();
  } catch (error) {
    console.log("Error!!!");
  }
}

addBlogASYNC({ id: 4, title: 'Blog 4', description: 'Description 4' })
