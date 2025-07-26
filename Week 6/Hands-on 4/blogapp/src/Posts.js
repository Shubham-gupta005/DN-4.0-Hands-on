import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [], 
      hasError: false, 
      error: null, 
    };
  }


  loadPosts = async () => {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/posts'); 
      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }
      const data = await response.json();
      
      this.setState({ posts: data }); 
    } catch (error) {
      console.error("Failed to fetch posts:", error);
      this.setState({ hasError: true, error: error });
    }
  };

  
  componentDidMount() {
    this.loadPosts(); 
  }

  componentDidCatch(error, info) {
    this.setState({ hasError: true, error: error });
    console.error("Error caught by componentDidCatch:", error, info);
    alert(`An error occurred: ${error.message}`);
  }

  
  render() {
    if (this.state.hasError) {
      return <h1>Something went wrong. Please try again later.</h1>;
    }

    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map(post => (
          <div key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;