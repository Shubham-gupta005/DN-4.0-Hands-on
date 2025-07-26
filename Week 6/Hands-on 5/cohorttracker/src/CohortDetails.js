import React from 'react';
import styles from './CohortDetails.module.css';

class CohortDetails extends React.Component {
  render() {
    const { cohort } = this.props;

    const headingStyle = {
      color: cohort.status === 'Ongoing' ? 'green' : 'blue'
    };

    return (
      <div className={styles.box}> {/* Apply the box class [cite: 155] */}
        <h3 style={headingStyle}>{cohort.name} - {cohort.type}</h3>
        <dl>
          <dt>Started On</dt>
          <dd>{cohort.startedOn}</dd>
          <dt>Current Status</dt>
          <dd>{cohort.status}</dd>
          <dt>Coach</dt>
          <dd>{cohort.coach}</dd>
          <dt>Trainer</dt>
          <dd>{cohort.trainer}</dd>
        </dl>
      </div>
    );
  }
}

export default CohortDetails;