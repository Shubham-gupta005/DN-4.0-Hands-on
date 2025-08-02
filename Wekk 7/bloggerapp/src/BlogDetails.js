import React from 'react';

function BlogDetails(props) {
  const { blogs } = props;
  if (!blogs || blogs.length === 0) {
    return null;
  }
  return (
    <div>
      <h2>Blog Details</h2>
      {blogs.map(blog => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <p>{blog.author}</p>
          <p>{blog.content}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;
