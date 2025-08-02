import React from 'react';

function CourseDetails(props) {
  const { courses } = props;
  if (!courses || courses.length === 0) {
    return null;
  }
  return (
    <div>
      <h2>Course Details</h2>
      {courses.map(course => (
        <div key={course.id}>
          <h3>{course.name}</h3>
          <p>{course.date}</p>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;