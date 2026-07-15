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
  random: true,
  image: false,
  solutionImage: false
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
  random: true,
  image: false,
  solutionImage: false
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
  random: true,
  image: false,
  solutionImage: false
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
    "encoded": "PNR MJSXQRV JI K PNJSGKQC DBFRG ARWBQG ZBPN K GBQWFR GPRY",
    "original": "The journey of a thousand miles begins with a single step",
    "cipher": {
      "A": "K",
      "B": "A",
      "C": "H",
      "D": "C",
      "E": "R",
      "F": "I",
      "G": "W",
      "H": "N",
      "I": "B",
      "J": "M",
      "K": "E",
      "L": "F",
      "M": "D",
      "N": "Q",
      "O": "J",
      "P": "Y",
      "Q": "T",
      "R": "X",
      "S": "G",
      "T": "P",
      "U": "S",
      "V": "L",
      "W": "Z",
      "X": "O",
      "Y": "V",
      "Z": "U"
    },
    "letterCount": 47,
    "wordCount": 11,
    "html": "<html><head><title>Cryptogram Puzzle</title><style>body {font-family: Arial, sans-serif; padding: 20px; max-width: 800px; margin: 0 auto;}h1 {text-align: center;}.puzzle {font-family: monospace; font-size: 24px; letter-spacing: 3px; line-height: 2.5; word-wrap: break-word;}.letter-box {display: inline-block; text-align: center; margin: 2px;}.encoded {border-bottom: 2px solid #333; min-width: 20px; display: block;}.answer {color: #ccc; font-size: 14px;}.space {width: 15px; display: inline-block;}.hint {margin-top: 30px; padding: 15px; background: #f5f5f5; border-radius: 5px;}.hint h3 {margin-top: 0;}</style></head><body><h1>Cryptogram</h1><div class='puzzle'><span class='letter-box'><span class='encoded'>P</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>N</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>R</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>M</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>J</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>S</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>X</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>Q</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>R</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>V</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>J</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>I</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>K</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>P</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>N</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>J</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>S</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>G</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>K</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>Q</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>C</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>D</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>B</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>F</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>R</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>G</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>A</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>R</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>W</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>B</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>Q</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>G</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>Z</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>B</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>P</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>N</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>K</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>G</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>B</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>Q</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>W</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>F</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>R</span><span class='answer'>_</span></span><span class='space'></span><span class='letter-box'><span class='encoded'>G</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>P</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>R</span><span class='answer'>_</span></span><span class='letter-box'><span class='encoded'>Y</span><span class='answer'>_</span></span></div><div class='hint'><h3>Letter Frequency:</h3><p>R=6, G=5, P=4, Q=4, B=4, N=3, J=3, K=3, S=2, F=2, W=2, M=1, X=1, V=1, I=1, C=1, D=1, A=1, Z=1, Y=1</p></div></body></html>",
    "image": {
      "imageName": "0afa5de4-52fb-4902-8139-c177c08ac98b_puzzle.png",
      "format": ".png",
      "downloadURL": "https://storage.googleapis.com/apiverve/APIData/cryptogram/0afa5de4-52fb-4902-8139-c177c08ac98b_puzzle.png?GoogleAccessId=635500398038-compute%40developer.gserviceaccount.com&Expires=1766010132&Signature=guv7GNCup4lJXTI0iCF7Bo2Cz02Wl6h2HWC0YxJ0jtzb7w%2BlW80b1OzBlGR%2BneFxFdzQPwfIuMQlaHsW0KFqPh5ITsFkSt802OEUFyxuiDn71y4XkiJx8zVDhrxNH9R9i1befMM16c%2F4WQGpgzkaaXw8TJJUT2q2s8c8ESo41K85iYcHJZ%2BGUxXeMeFDJ%2FG38pq5txarX%2F0rnmdTk0Jk%2BhEox9PXFPCzaSvWbDFYDVABIt97N2NQyqlDPRcucrm5uuE5Jb9qjT80JqzlumfqiaR3DpgPDwZkWeVyuYW4b4TZCCbbEpK%2FIlRRUZTw9gYdxDpk0B35NKN9WKSCi%2BfFWQ%3D%3D",
      "expires": 1766010132300
    },
    "solutionImage": {
      "imageName": "41e6b5b7-d98c-4d4d-8b44-f56bdb5160b9_solution.png",
      "format": ".png",
      "downloadURL": "https://storage.googleapis.com/apiverve/APIData/cryptogram/41e6b5b7-d98c-4d4d-8b44-f56bdb5160b9_solution.png?GoogleAccessId=635500398038-compute%40developer.gserviceaccount.com&Expires=1766010132&Signature=YKDpJF9MYlmXjASdgVUgtPCq8%2Fp59Eci6DIAbXuHzv9B4rALSZwyq1sMj9KoIRhryYCdNW1KGBRpcgJFSFgaEGfcNC1MNsryoV%2F7bp3TSr1%2BknwqAGQu7sWvZrtozB2oJ3Wzaqz%2BGjm74rhrOaqAx0w7%2BmJtimslEHCl8emRuZxmAhW9l8Wi%2Fv%2BsCmb7%2Bl5hj0njHSs6AWo3YtoZpWoNv7F49g1dQczrfj%2BFYW7bOoFMfcmysTz%2ByNpXECZFbvWJ3A2f0fql7itGLGK%2B%2BNlI6Q6WkQ1ye3c7skHB3DqT%2BWHLbJCm0vjbIVhIgq3Vo39ZADdogcd7uiklvEBriMFkwA%3D%3D",
      "expires": 1766010132645
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
