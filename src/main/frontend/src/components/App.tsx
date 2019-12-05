import React, { useState, useEffect } from 'react';
import {Hero} from './Hero';
import {Card} from './Card';

const MOCK = {
  bigPlants: {
    title: 'Big plants',
    moisture: 50,
    history: [
      'Cras justo odio',
      'Dapibus ac facilisis in',
      'Morbi leo risus',
      'Porta ac consectetur ac',
      'Vestibulum at eros'
    ]
  },
  mediumPlants: {
    title: 'Medium plants',
    moisture: 50,
    history: [
      'Cras justo odio',
      'Dapibus ac facilisis in',
      'Morbi leo risus',
      'Porta ac consectetur ac',
      'Vestibulum at eros'
    ]
  },
  smallPlants: {
    title: 'Small plants',
    moisture: 50,
    history: [
      'Cras justo odio',
      'Dapibus ac facilisis in',
      'Morbi leo risus',
      'Porta ac consectetur ac',
      'Vestibulum at eros'
    ]
  }
};

const App: React.FC = () => {
  const [cards, setCards] = useState(MOCK);
  const [test, setTest] = useState({});
  useEffect(() => {
    fetch('https://jsonplaceholder.typicode.com/todos/1')
      .then(response => response.json())
      .then(json => {
        setTest(json);
      })
      
  }, []);

  console.log('test: ', test)
  return (
    <div>
      <Hero title={'Hey! Let\'s check your flowers'} />
      <div className="container">
        <div className="row">
          <Card
            title={cards.bigPlants.title}
            moisture={cards.bigPlants.moisture}
            history={cards.bigPlants.history}
          />
          <Card
            title={cards.mediumPlants.title}
            moisture={cards.mediumPlants.moisture}
            history={cards.mediumPlants.history}
          />
          <Card
            title={cards.smallPlants.title}
            moisture={cards.smallPlants.moisture}
            history={cards.smallPlants.history}
          />
        </div>
      </div>
    </div>
  );
}

export default App;
