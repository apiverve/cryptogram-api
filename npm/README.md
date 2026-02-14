# Cryptogram Generator API

Cryptogram Generator creates letter substitution cipher puzzles where each letter is replaced with another letter consistently throughout the text.

![Build Status](https://img.shields.io/badge/build-passing-green)
![Code Climate](https://img.shields.io/badge/maintainability-B-purple)
![Prod Ready](https://img.shields.io/badge/production-ready-blue)
[![npm version](https://img.shields.io/npm/v/@apiverve/cryptogram.svg)](https://www.npmjs.com/package/@apiverve/cryptogram)

This is a Javascript Wrapper for the [Cryptogram Generator API](https://apiverve.com/marketplace/cryptogram?utm_source=npm&utm_medium=readme)

---

## Installation

Using npm:
```shell
npm install @apiverve/cryptogram
```

Using yarn:
```shell
yarn add @apiverve/cryptogram
```

---

## Configuration

Before using the Cryptogram Generator API client, you have to setup your account and obtain your API Key.
You can get it by signing up at [https://apiverve.com](https://apiverve.com?utm_source=npm&utm_medium=readme)

---

## Quick Start

[Get started with the Quick Start Guide](https://docs.apiverve.com/quickstart?utm_source=npm&utm_medium=readme)

The Cryptogram Generator API documentation is found here: [https://docs.apiverve.com/ref/cryptogram](https://docs.apiverve.com/ref/cryptogram?utm_source=npm&utm_medium=readme).
You can find parameters, example responses, and status codes documented here.

### Setup

```javascript
const cryptogramAPI = require('@apiverve/cryptogram');
const api = new cryptogramAPI({
    api_key: '[YOUR_API_KEY]'
});
```

---

## Usage

---

### Perform Request

Using the API is simple. All you have to do is make a request. The API will return a response with the data you requested.

```javascript
var query = {
  text: "The quick brown fox",
  random: true
};

api.execute(query, function (error, data) {
    if (error) {
        return console.error(error);
    } else {
        console.log(data);
    }
});
```

---

### Using Promises

You can also use promises to make requests. The API returns a promise that you can use to handle the response.

```javascript
var query = {
  text: "The quick brown fox",
  random: true
};

api.execute(query)
    .then(data => {
        console.log(data);
    })
    .catch(error => {
        console.error(error);
    });
```

---

### Using Async/Await

You can also use async/await to make requests. The API returns a promise that you can use to handle the response.

```javascript
async function makeRequest() {
    var query = {
  text: "The quick brown fox",
  random: true
};

    try {
        const data = await api.execute(query);
        console.log(data);
    } catch (error) {
        console.error(error);
    }
}
```

---

## Example Response

```json
{
  "status": "ok",
  "error": null,
  "data": {
    "encoded": "SDVF DX JRHZ RHYYFMX JRFM OPG HQF LGXO WHADMB PZRFQ YSHMX",
    "original": "Life is what happens when you are busy making other plans",
    "cipher": {
      "A": "H",
      "B": "L",
      "C": "E",
      "D": "C",
      "E": "F",
      "F": "V",
      "G": "B",
      "H": "R",
      "I": "D",
      "J": "T",
      "K": "A",
      "L": "S",
      "M": "W",
      "N": "M",
      "O": "P",
      "P": "Y",
      "Q": "N",
      "R": "Q",
      "S": "X",
      "T": "Z",
      "U": "G",
      "V": "U",
      "W": "J",
      "X": "K",
      "Y": "O",
      "Z": "I"
    },
    "letterCount": 47,
    "wordCount": 11,
    "html": "<html><head><title>Cryptogram Puzzle</title><style>body {font-family: Arial, sans-serif; padding: 20px; max-width: 800px; margin: 0 auto;}h1 {text-align: center;}.puzzle {font-family: monospace; font-size: 24px; letter-spacing: 3px; line-height: 2.5; word-wrap: break-word;}.letter-box {display: inline-block; text-align: center; margin: 2px;}.encoded {border-bottom: 2px solid #333; min-width: 20px; display: block;}.answer {color: #ccc; font-size: 14px;}.space {width: 15px; display: inline-block;}.hint {margin-top: 30px; padding: 15px; background: #f5f5f5; border-radius: 5px;}.hint h3 {margin-top: 0;}</style></head><body><h1>Cryptogram</h1><div class='puzzle'><span class='letter-box'><span class='encoded'>S</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>D</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>V</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>F</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>D</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>X</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>J</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>R</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>H</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>Z</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>R</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>H</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>Y</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>Y</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>F</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>M</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>X</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>J</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>R</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>F</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>M</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>O</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>P</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>G</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>H</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>Q</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>F</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>L</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>G</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>X</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>O</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>W</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>H</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>A</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>D</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>M</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>B</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>P</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>Z</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>R</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>F</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>Q</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>Y</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>S</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>H</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>M</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>X</span><span class='answer'>_</span></span></div><div class='hint'><h3>Letter Frequency:</h3><p>F=5, H=5, X=4, R=4, M=4, D=3, Y=3, S=2, J=2, Z=2, O=2, P=2, G=2, Q=2, V=1, L=1, W=1, A=1, B=1</p></div></body></html>",
    "image": {
      "imageName": "0c97c656-8539-4821-b57e-65e7960343eb_puzzle.png",
      "format": ".png",
      "downloadURL": "https://storage.googleapis.com/apiverve.appspot.com/cryptogram/0c97c656-8539-4821-b57e-65e7960343eb_puzzle.png?GoogleAccessId=635500398038-compute%40developer.gserviceaccount.com&Expires=1764735737&Signature=goEvx1i2b3GCRF%2FiEyRMYfXYxdx1PStlkMnNmRPKIkkyPZqj1NS7q%2BrliWd2E4z7GxXQNOdpOE6ngRxvptzMzFaj1WNvuta%2BDXDf6o7gQma1grNmvOx%2F4LKGhy0S1w89uqmhG7z9tnSn0XFOy6L%2BfhAw2Uy2nFNHtdzUFRDs6ru9x44dRC5wHUYcr%2Fdt7H9jAQnJ7uywJJebGmMKCPbTU1ZHi7LW0OvbOf%2FouSdSAab5MCymh8WBXY5Xs4GC9jYBeWE3HrrwDHGUgUWYK06f5SLXvgmvZuQ8fkiRrh%2FqoRZr0lCjFWq%2BMFwsiPAYmoRg0hm4ADa8%2BoEmjt9z%2F22x3A%3D%3D",
      "expires": 1764735737560
    },
    "solutionImage": {
      "imageName": "cd314685-d2ad-443a-8058-b918de1de244_solution.png",
      "format": ".png",
      "downloadURL": "https://storage.googleapis.com/apiverve.appspot.com/cryptogram/cd314685-d2ad-443a-8058-b918de1de244_solution.png?GoogleAccessId=635500398038-compute%40developer.gserviceaccount.com&Expires=1764735738&Signature=e8P5kdAEdU8PDglB4aZzXQHszL4NmVgyRPs%2FDzlQiDrLMJapVJjNvBphU5oxVXNPvc78mEqPYqMjBGxNkc3sc%2Bn1oX%2BptA1TVk3Yg6pbQXQqkh5jdC8AIhBsebfelhkP1p0SwShL%2BsHhMEnVy%2BFEUb%2B%2BDtW%2BYyQg92C%2B5LxdwqDVdjeTkY17EdixnacXg3nLw0XvOrVHsCuLuWHyJhpnQCOetLHlCir23swJtB178W%2BCO87Rj4bnPfnKpdOCooHvXTZORbrcJSbE2rUTXMdNw9Lnc8wRuJ0iRp3z4EuPhwd28ZBbP%2BiTRX1vM4%2Fo1fN0xn7LlTIuZZH8mkVsWidhDA%3D%3D",
      "expires": 1764735738052
    }
  }
}
```

---

## Customer Support

Need any assistance? [Get in touch with Customer Support](https://apiverve.com/contact?utm_source=npm&utm_medium=readme).

---

## Updates

Stay up to date by following [@apiverveHQ](https://twitter.com/apiverveHQ) on Twitter.

---

## Legal

All usage of the APIVerve website, API, and services is subject to the [APIVerve Terms of Service](https://apiverve.com/terms?utm_source=npm&utm_medium=readme), [Privacy Policy](https://apiverve.com/privacy?utm_source=npm&utm_medium=readme), and [Refund Policy](https://apiverve.com/refund?utm_source=npm&utm_medium=readme).

---

## License
Licensed under the The MIT License (MIT)

Copyright (&copy;) 2026 APIVerve, and EvlarSoft LLC

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
