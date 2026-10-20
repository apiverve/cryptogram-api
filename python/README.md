Cryptogram Generator API
============

Cryptogram Generator creates letter substitution cipher puzzles where each letter is replaced with another letter consistently throughout the text.


[![PyPI version](https://img.shields.io/pypi/v/apiverve-cryptogramgenerator.svg)](https://pypi.org/project/apiverve-cryptogramgenerator/)

This is a Python wrapper for the [Cryptogram Generator API](https://apiverve.com/marketplace/cryptogram?utm_source=pypi&utm_medium=referral&utm_content=readme)

---

## Installation

Using `pip`:

```bash
pip install apiverve-cryptogramgenerator
```

Using `pip3`:

```bash
pip3 install apiverve-cryptogramgenerator
```

---

## Configuration

Before using the Cryptogram Generator API client, you have to setup your account and obtain your API Key.
You can get it by signing up at [https://apiverve.com](https://apiverve.com?utm_source=pypi&utm_medium=referral&utm_content=readme)

---

## Quick Start

Here's a simple example to get you started quickly:

```python
from apiverve_cryptogramgenerator.apiClient import CryptogramAPIClient

# Initialize the client with your APIVerve API key
api = CryptogramAPIClient("[YOUR_API_KEY]")

query = {
    "text": "The quick brown fox",
    "random": true,
    "image": true,
    "solutionImage": true
}

try:
    # Make the API call
    result = api.execute(query)

    # Print the result
    print(result)
except Exception as e:
    print(f"Error: {e}")
```

---

## Usage

The Cryptogram Generator API documentation is found here: [https://docs.apiverve.com/ref/cryptogram](https://docs.apiverve.com/ref/cryptogram?utm_source=pypi&utm_medium=referral&utm_content=readme).
You can find parameters, example responses, and status codes documented here.

### Setup

```python
# Import the client module
from apiverve_cryptogramgenerator.apiClient import CryptogramAPIClient

# Initialize the client with your APIVerve API key
api = CryptogramAPIClient("[YOUR_API_KEY]")
```

---

## Perform Request

Using the API client, you can perform requests to the API.

###### Define Query

```python
query = {
    "text": "The quick brown fox",
    "random": true,
    "image": true,
    "solutionImage": true
}
```

###### Simple Request

```python
# Make a request to the API
result = api.execute(query)

# Print the result
print(result)
```

###### Example Response

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

## Error Handling

The API client provides comprehensive error handling through the `CryptogramAPIClientError` exception. Here are some examples:

### Basic Error Handling

```python
from apiverve_cryptogramgenerator.apiClient import CryptogramAPIClient, CryptogramAPIClientError

api = CryptogramAPIClient("[YOUR_API_KEY]")

query = {
    "text": "The quick brown fox",
    "random": true,
    "image": true,
    "solutionImage": true
}

try:
    result = api.execute(query)
    print("Success!")
    print(result)
except CryptogramAPIClientError as e:
    print(f"API Error: {e.message}")
    if e.status_code:
        print(f"Status Code: {e.status_code}")
    if e.response:
        print(f"Response: {e.response}")
```

### Handling Specific Error Types

```python
from apiverve_cryptogramgenerator.apiClient import CryptogramAPIClient, CryptogramAPIClientError

api = CryptogramAPIClient("[YOUR_API_KEY]")

query = {
    "text": "The quick brown fox",
    "random": true,
    "image": true,
    "solutionImage": true
}

try:
    result = api.execute(query)

    # Check for successful response
    if result.get('status') == 'success':
        print("Request successful!")
        print(result.get('data'))
    else:
        print(f"API returned an error: {result.get('error')}")

except CryptogramAPIClientError as e:
    # Handle API client errors
    if e.status_code == 401:
        print("Unauthorized: Invalid API key")
    elif e.status_code == 429:
        print("Rate limit exceeded")
    elif e.status_code >= 500:
        print("Server error - please try again later")
    else:
        print(f"API error: {e.message}")
except Exception as e:
    # Handle unexpected errors
    print(f"Unexpected error: {str(e)}")
```

### Using Context Manager (Recommended)

The client supports the context manager protocol for automatic resource cleanup:

```python
from apiverve_cryptogramgenerator.apiClient import CryptogramAPIClient, CryptogramAPIClientError

query = {
    "text": "The quick brown fox",
    "random": true,
    "image": true,
    "solutionImage": true
}

# Using context manager ensures proper cleanup
with CryptogramAPIClient("[YOUR_API_KEY]") as api:
    try:
        result = api.execute(query)
        print(result)
    except CryptogramAPIClientError as e:
        print(f"Error: {e.message}")
# Session is automatically closed here
```

---

## Advanced Features

### Debug Mode

Enable debug logging to see detailed request and response information:

```python
from apiverve_cryptogramgenerator.apiClient import CryptogramAPIClient

# Enable debug mode
api = CryptogramAPIClient("[YOUR_API_KEY]", debug=True)

query = {
    "text": "The quick brown fox",
    "random": true,
    "image": true,
    "solutionImage": true
}

# Debug information will be printed to console
result = api.execute(query)
```

### Manual Session Management

If you need to manually manage the session lifecycle:

```python
from apiverve_cryptogramgenerator.apiClient import CryptogramAPIClient

api = CryptogramAPIClient("[YOUR_API_KEY]")

query = {
    "text": "The quick brown fox",
    "random": true,
    "image": true,
    "solutionImage": true
}

try:
    result = api.execute(query)
    print(result)
finally:
    # Manually close the session when done
    api.close()
```

---

## Customer Support

Need any assistance? [Get in touch with Customer Support](https://apiverve.com/contact?utm_source=pypi&utm_medium=referral&utm_content=readme).

---

## Updates
Stay up to date by following [@apiverveHQ](https://twitter.com/apiverveHQ) on Twitter.

---

## Legal

All usage of the APIVerve website, API, and services is subject to the [APIVerve Terms of Service](https://apiverve.com/terms?utm_source=pypi&utm_medium=referral&utm_content=readme) and all legal documents and agreements.

---

## License
Licensed under the MIT License (MIT)

Copyright (&copy;) 2026 APIVerve, and EvlarSoft LLC

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
