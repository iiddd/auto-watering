import React from 'react';
import {get} from '../../utils/networking';
type HeroProps = { title: string };

export function Hero(props: HeroProps) {
  const handlers = {
    onRefreshButtonClick() {
      console.log('Refresh clicked!');
      get('https://jsonplaceholder.typicode.com/todos/1')
        .then(json => {
          console.log('Refresh response: ', json)
        });
    },
    onStopAutomationButtonClick() {
      console.log('StopAutomation clicked!');
      get('https://jsonplaceholder.typicode.com/todos/1')
        .then(json => {
          console.log('StopAutomation response: ', json)
        });
    }
  };
  

  return (
    <div className="jumbotron text-center hero">
      <div className="container">
        <div className="hero-content">
          <h1>{props.title}</h1>

          <div>
            <button
              className="btn btn-primary btn-lg"
              onClick={handlers.onRefreshButtonClick}
            >Refresh</button>

            <button
              className="btn btn-primary btn-lg"
              onClick={handlers.onStopAutomationButtonClick}
            >Stop automation</button>
          </div>

        </div>
      </div>
    </div>
  );
}
