import './App.css';
import CourseDetails from './CourseDetails';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';

function App() {
  const courses = [
    { id: 1, name: 'Angular', date: '4/5/2021' },
    { id: 2, name: 'React', date: '6/3/2020' },
  ];

  const books = [
    { id: 1, bname: 'Master React', price: 670 },
    { id: 2, bname: 'Deep Dive Into Angular 11', price: 800 },
    { id: 3, bname: 'Mongo Essentials', price: 450 },
  ];

  const blogs = [
    { id: 1, title: 'React Learning', author: 'Stephen Biz', content: 'Welcome to learning React!' },
    { id: 2, title: 'Installation', author: 'Schewzdenier', content: 'You can install React from npm.' },
  ];

  return (
    <div className="App">
      <div style={{ display: 'flex', justifyContent: 'space-around', border: '1px solid black', padding: '10px' }}>
        <CourseDetails courses={courses} />
        <div style={{ borderLeft: '2px solid green', height: 'auto', margin: '0 20px' }}></div>
        <BookDetails books={books} />
        <div style={{ borderLeft: '2px solid green', height: 'auto', margin: '0 20px' }}></div>
        <BlogDetails blogs={blogs} />
      </div>
    </div>
  );
}

export default App;
