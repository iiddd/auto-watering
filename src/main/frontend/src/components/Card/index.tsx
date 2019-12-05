import React from 'react';
import {get} from '../../utils/networking';

type CardProps = {
  title: string,
  moisture: number,
  history: string[]
}

function onButtonClick() {
  console.log('Water now clicked!');
  get('https://jsonplaceholder.typicode.com/todos/1')
    .then(json => {
      console.log('Water now response: ', json)
    });
}

export function Card(props: CardProps) {
  return (
    <div className="col-sm-12 col-md-6 col-lg-4">
      <div className="card">
        <div className="card-header">
          {props.title}
        </div>
        <div className="card-body">
          <h5 className="card-title">Current soil moisture:</h5>
          <div className="progress">
            <div
              className="progress-bar bg-info"
              role="progressbar"
              style={{width: `${props.moisture}%`}}
              aria-valuenow={props.moisture}
              aria-valuemin={0}
              aria-valuemax={100}
            >
              {`${props.moisture}%`}
            </div>
          </div>

          <div className='text-center pt-2 mb-4'>
            <button
              className="btn btn-primary"
              onClick={onButtonClick}
            >
              Water now
            </button>
          </div>
          <h5 className="card-text">Watering history:</h5>
          <ul className="list-group list-group-flush">
            {
              props.history.map(((item, index) =>
                <li key={index} className="list-group-item">{item}</li>))
            }
          </ul>
        </div>
      </div>
    </div>
  );
}
