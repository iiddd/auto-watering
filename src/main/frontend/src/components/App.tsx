import React, { useState, useEffect } from 'react';
import {Hero} from './Hero';
import {Card} from './Card';
import {TypeCards} from '../types';

const MOCK_CARDS: TypeCards = {
  bigPlants: {
    title: 'Big plants',
    moisture: 50,
    history: [
      { date: '', text: 'Cras justo odio' },
      { date: '', text: 'Dapibus ac facilisis in' },
      { date: '', text: 'Morbi leo risus' },
      { date: '', text: 'Porta ac consectetur ac' },
      { date: '', text: 'Vestibulum at eros' }
    ]
  },
  mediumPlants: {
    title: 'Medium plants',
    moisture: 50,
    history: [
      { date: '', text: 'Cras justo odio' },
      { date: '', text: 'Dapibus ac facilisis in' },
      { date: '', text: 'Morbi leo risus' },
      { date: '', text: 'Porta ac consectetur ac' },
      { date: '', text: 'Vestibulum at eros' }
    ]
  },
  smallPlants: {
    title: 'Small plants',
    moisture: 50,
    history: [
      { date: '', text: 'Cras justo odio' },
      { date: '', text: 'Dapibus ac facilisis in' },
      { date: '', text: 'Morbi leo risus' },
      { date: '', text: 'Porta ac consectetur ac' },
      { date: '', text: 'Vestibulum at eros' }
    ]
  }
};

const defaultCardsData: TypeCards = {
  bigPlants: {
    title: 'Big plants',
    moisture: 0,
    history: []
  },
  mediumPlants: {
    title: 'Medium plants',
    moisture: 0,
    history: []
  },
  smallPlants: {
    title: 'Small plants',
    moisture: 0,
    history: []
  }
};

const App: React.FC = () => {
  const [cards, setCards] = useState(defaultCardsData);

  function fetchPopulateData() {
    fetch('https://jsonplaceholder.typicode.com/todos/1')
      .then(response => response.json())
      .then(json => {
        setCards(MOCK_CARDS);
      })
  }
  useEffect(() => {
    fetchPopulateData();
  }, []);

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
