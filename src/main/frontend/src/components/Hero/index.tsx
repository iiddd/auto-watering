import React from 'react';
import {get, post} from '../../utils/networking';

type HeroProps = {
  title: string
  isAutomationStatusOn: boolean
};

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
      post('https://jsonplaceholder.typicode.com/todos/1', {})
        .then(json => {
          console.log('StopAutomation response: ', json)
        });
    },
    onStartAutomationButtonClick() {
      console.log('StopAutomation clicked!');
      post('https://jsonplaceholder.typicode.com/todos/1', {
        automationStatus: props.isAutomationStatusOn
      })
        .then(json => {
          console.log('StartAutomation response: ', json)
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
              className="btn btn-primary btn-lg mx-3"
              onClick={handlers.onRefreshButtonClick}
            >Refresh</button>

            {
              props.isAutomationStatusOn
                ? (<button
                      className="btn btn-warning btn-lg mx-3"
                      onClick={handlers.onStopAutomationButtonClick}
                    >Stop automation</button>)
                : (<button
                  className="btn btn-primary btn-lg mx-3"
                  onClick={handlers.onStartAutomationButtonClick}
                >Start automation</button>)

            }
            
          </div>

        </div>
      </div>
    </div>
  );
}
