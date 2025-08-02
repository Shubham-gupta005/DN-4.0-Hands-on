import React from 'react';

class EventHandling extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      inputValue: '',
      checkboxValue: false,
      selectValue: 'option1',
      hoverMessage: 'Hover over me'
    };
  }

  handleInputChange = (event) => {
    this.setState({ inputValue: event.target.value });
  };

  handleCheckboxChange = (event) => {
    this.setState({ checkboxValue: event.target.checked });
  };

  handleSelectChange = (event) => {
    this.setState({ selectValue: event.target.value });
  };

  handleButtonClick = () => {
    alert('Button was clicked!');
  };

  handleMouseOver = () => {
    this.setState({ hoverMessage: 'You are hovering!' });
  };

  handleMouseOut = () => {
    this.setState({ hoverMessage: 'Hover over me' });
  };

  render() {
    return (
      <div>
        <h1>Event Handling Examples</h1>

        <div>
          <label>Text Input: </label>
          <input type="text" value={this.state.inputValue} onChange={this.handleInputChange} />
          <p>Current value: {this.state.inputValue}</p>
        </div>

        <div>
          <label>Checkbox: </label>
          <input type="checkbox" checked={this.state.checkboxValue} onChange={this.handleCheckboxChange} />
          <p>Checkbox is {this.state.checkboxValue ? 'checked' : 'unchecked'}</p>
        </div>

        <div>
          <label>Select Dropdown: </label>
          <select value={this.state.selectValue} onChange={this.handleSelectChange}>
            <option value="option1">Option 1</option>
            <option value="option2">Option 2</option>
            <option value="option3">Option 3</option>
          </select>
          <p>Selected value: {this.state.selectValue}</p>
        </div>

        <div>
          <button onClick={this.handleButtonClick}>Click Me</button>
        </div>

        <div onMouseOver={this.handleMouseOver} onMouseOut={this.handleMouseOut}>
          <p>{this.state.hoverMessage}</p>
        </div>
      </div>
    );
  }
}

export default EventHandling;