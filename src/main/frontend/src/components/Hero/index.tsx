import React from 'react';
import {get} from '../../utils/networking';

type HeroProps = { title: string };

function onRefreshButtonClick() {
  console.log('Refresh clicked!');
  get('https://jsonplaceholder.typicode.com/todos/1')
    .then(json => {
      console.log('Refresh response: ', json)
    });
}

function onStopAutomationButtonClick() {
  console.log('StopAutomation clicked!');
  get('https://jsonplaceholder.typicode.com/todos/1')
    .then(json => {
      console.log('StopAutomation response: ', json)
    });
}

export function Hero(props: HeroProps) {
  return (
    <div className="jumbotron text-center hero">
      <div className="container">
        <div className="hero-content">
          <h1>{props.title}</h1>
          
          <div>
            <button
              className="btn btn-primary btn-lg"
              onClick={onRefreshButtonClick}
            >
              Refresh
            </button>
            <button
              className="btn btn-primary btn-lg"
              onClick={onStopAutomationButtonClick}
            >
              Stop automation
            </button>
          </div>

        </div>
      </div>
    </div>
  );
}
