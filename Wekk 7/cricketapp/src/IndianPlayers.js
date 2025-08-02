import React from 'react';

const T20Players = ['First Player', 'Second Player', 'Third Player'];
const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];

const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

function OddPlayers({ first, third, fifth }) {
  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        <li>First : {first}</li>
        <li>Third : {third}</li>
        <li>Fifth : {fifth}</li>
      </ul>
    </div>
  );
}

function EvenPlayers({ second, fourth, sixth }) {
  return (
    <div>
      <h2>Even Team Players</h2>
      <ul>
        <li>Second : {second}</li>
        <li>Fourth : {fourth}</li>
        <li>Sixth : {sixth}</li>
      </ul>
    </div>
  );
}

function PlayerList() {
  const [first, second, third, fourth, fifth, sixth] = IndianPlayers;
  return (
    <div>
      <OddPlayers first={first} third={third} fifth={fifth} />
      <EvenPlayers second={second} fourth={fourth} sixth={sixth} />
    </div>
  );
}

export default PlayerList;