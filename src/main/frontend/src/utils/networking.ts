export function get(url:string): Promise<any> {
  return fetch(url, {
    method: 'GET',
    mode: 'cors',
    headers: {
      'Content-Type': 'application/json'
    },
  })
  .then(response => response.json())
  .catch(err => console.error(err));
};

export function post(url:string, data: any): Promise<any> {
  return fetch(url, {
    method: 'POST',
    mode: 'cors',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(data)
  })
  .then(response => response.json())
  .catch(err => console.error(err));
};
