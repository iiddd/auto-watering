import React, { useState, useEffect } from 'react';
import {Hero} from './Hero';
import {Card} from './Card';
import {TypeCards} from '../types';
import {get} from '../utils/networking';

const MOCK_CARDS: TypeCards = {
  bigPlants: {
    title: 'Big plants',
    moisture: 50,
    history: [
      { date: '12.12.2090 12:00', status: 'Cras justo odio' },
      { date: '', status: 'Dapibus ac facilisis in' },
      { date: '', status: 'Morbi leo risus' },
      { date: '', status: 'Porta ac consectetur ac' },
      { date: '', status: 'Vestibulum at eros' }
    ]
  },
  mediumPlants: {
    title: 'Medium plants',
    moisture: 50,
    history: [
      { date: '', status: 'Cras justo odio' },
      { date: '', status: 'Dapibus ac facilisis in' },
      { date: '', status: 'Morbi leo risus' },
      { date: '', status: 'Porta ac consectetur ac' },
      { date: '', status: 'Vestibulum at eros' }
    ]
  },
  smallPlants: {
    title: 'Small plants',
    moisture: 50,
    history: [
      { date: '', status: 'Cras justo odio' },
      { date: '', status: 'Dapibus ac facilisis in' },
      { date: '', status: 'Morbi leo risus' },
      { date: '', status: 'Porta ac consectetur ac' },
      { date: '', status: 'Vestibulum at eros' }
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
  const [isAutomationStatusOn, setIsAutomationStatusOn] = useState(true);

  function fetchPopulateData() {
    return get('https://jsonplaceholder.typicode.com/todos/1')
      .then(cards => {
        setCards(MOCK_CARDS);
      })
  }
  function getAutomationStatus() {
    return get('https://jsonplaceholder.typicode.com/todos/1')
      .then(status => {
        setIsAutomationStatusOn(true);
      })
  }

  useEffect(() => {
    fetchPopulateData();
    getAutomationStatus();
  }, []);

  return (
    <div>
      <Hero
        title={'Hey! Let\'s check your flowers'}
        isAutomationStatusOn={isAutomationStatusOn}
      />
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
