# [Cryptogram Generator API](https://apiverve.com/marketplace/cryptogram?utm_source&#x3D;github&amp;utm_medium&#x3D;readme)

Cryptogram Generator creates letter substitution cipher puzzles where each letter is replaced with another letter consistently throughout the text.

The Cryptogram Generator API provides a simple, reliable way to integrate cryptogram generator functionality into your applications. Built for developers who need production-ready cryptogram generator capabilities without the complexity of building from scratch.

**[View API Details →](https://apiverve.com/marketplace/cryptogram?utm_source&#x3D;github&amp;utm_medium&#x3D;readme)**

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![API Status](https://img.shields.io/badge/Status-Active-green.svg)](https://apiverve.com/marketplace/cryptogram?utm_source&#x3D;github&amp;utm_medium&#x3D;readme)
[![Method](https://img.shields.io/badge/Method-GET-blue.svg)](#)
[![Platform](https://img.shields.io/badge/Platform-Multi--Platform-orange.svg)](#installation)

**Available on:**
[![npm](https://img.shields.io/badge/npm-CB3837?style=flat&logo=npm&logoColor=white)](https://www.npmjs.com/package/@apiverve/cryptogram)
[![NuGet](https://img.shields.io/badge/NuGet-004880?style=flat&logo=nuget&logoColor=white)](https://www.nuget.org/packages/APIVerve.API.CryptogramGenerator)
[![PyPI](https://img.shields.io/badge/PyPI-3776AB?style=flat&logo=python&logoColor=white)](https://pypi.org/project/apiverve-cryptogram/)
[![RubyGems](https://img.shields.io/badge/RubyGems-E9573F?style=flat&logo=rubygems&logoColor=white)](https://rubygems.org/gems/apiverve_cryptogram)
[![Packagist](https://img.shields.io/badge/Packagist-F28D1A?style=flat&logo=packagist&logoColor=white)](https://packagist.org/packages/apiverve/cryptogram)
[![Go](https://img.shields.io/badge/Go-00ADD8?style=flat&logo=go&logoColor=white)](#-go)
[![Dart](https://img.shields.io/badge/Dart-0175C2?style=flat&logo=dart&logoColor=white)](https://pub.dev/packages/apiverve_cryptogram)
[![JitPack](https://img.shields.io/badge/JitPack-2E7D32?style=flat&logo=android&logoColor=white)](#-android-jitpack)

---

## Quick Start

### Using JavaScript

```javascript
async function callCryptogramGeneratorAPI() {
    try {
        const params = new URLSearchParams({
            text: 'The quick brown fox',
            random: true
        });

        const response = await fetch(`https://api.apiverve.com/v1/cryptogram?${params}`, {
            method: 'GET',
            headers: {
                'x-api-key': 'YOUR_API_KEY_HERE'
            }
        });

        const data = await response.json();
        console.log(data);
    } catch (error) {
        console.error('Error:', error);
    }
}

callCryptogramGeneratorAPI();
```

### Using cURL

```bash
curl -X GET "https://api.apiverve.com/v1/cryptogram?text=The%20quick%20brown%20fox&random=true" \
  -H "x-api-key: YOUR_API_KEY_HERE"
```

**Get your API key:** [https://apiverve.com](https://apiverve.com)

**📁 For more examples, see the [examples folder](./examples/)**

---

## Installation

Choose your preferred programming language:

### 📦 NPM (JavaScript/Node.js)

```bash
npm install @apiverve/cryptogram
```

[**View NPM Package →**](https://www.npmjs.com/package/@apiverve/cryptogram) | [**Package Code →**](./npm/)

---

### 🔷 NuGet (.NET/C#)

```bash
dotnet add package APIVerve.API.CryptogramGenerator
```

[**View NuGet Package →**](https://www.nuget.org/packages/APIVerve.API.CryptogramGenerator) | [**Package Code →**](./nuget/)

---

### 🐍 Python (PyPI)

```bash
pip install apiverve-cryptogram
```

[**View PyPI Package →**](https://pypi.org/project/apiverve-cryptogram/) | [**Package Code →**](./python/)

---

### 💎 Ruby (RubyGems)

```bash
gem install apiverve_cryptogram
```

[**View RubyGems Package →**](https://rubygems.org/gems/apiverve_cryptogram) | [**Package Code →**](./ruby/)

---

### 🐘 PHP (Packagist)

```bash
composer require apiverve/cryptogram
```

[**View Packagist Package →**](https://packagist.org/packages/apiverve/cryptogram) | [**Package Code →**](./php/)

---

### 🎯 Dart (pub.dev)

```bash
dart pub add apiverve_cryptogram
```

[**View pub.dev Package →**](https://pub.dev/packages/apiverve_cryptogram) | [**Package Code →**](./dart/)

---

### 🤖 Android (JitPack)

```gradle
implementation 'com.github.apiverve:cryptogram-api:1.0.0'
```

[**Package Code →**](./android/)

---

### 🐹 Go

```bash
go get github.com/apiverve/cryptogram-api/go
```

[**Package Code →**](./go/)

---

## Why Use This API?

| Feature | Benefit |
|---------|---------|
| **Multi-language SDKs** | Native packages for JavaScript, Python, C#, Go, and Android |
| **Simple Integration** | Single API key authentication, consistent response format |
| **Production Ready** | 99.9% uptime SLA, served from 24 global regions |
| **Comprehensive Docs** | Full examples, OpenAPI spec, and dedicated support |

---

## Documentation

- 🏠 **API Home:** [Cryptogram Generator API](https://apiverve.com/marketplace/cryptogram?utm_source&#x3D;github&amp;utm_medium&#x3D;readme)
- 📚 **API Reference:** [docs.apiverve.com/ref/cryptogram](https://docs.apiverve.com/ref/cryptogram)
- 📖 **OpenAPI Spec:** [openapi.yaml](./openapi.yaml)
- 💡 **Examples:** [examples/](./examples/)

---

## What Can You Build?

The Cryptogram Generator API is commonly used for:

- **Web Applications** - Add cryptogram generator features to your frontend or backend
- **Mobile Apps** - Native SDKs for Android development
- **Automation** - Integrate with n8n, Zapier, or custom workflows
- **SaaS Products** - Enhance your product with cryptogram generator capabilities
- **Data Pipelines** - Process and analyze data at scale

---

## API Reference

### Authentication
All requests require an API key in the header:
```
x-api-key: YOUR_API_KEY_HERE
```

Get your API key: [https://apiverve.com](https://apiverve.com)

### Response Format

Every APIVerve endpoint returns the same envelope — check `status`, then read `data`:

```json
{
  "status": "ok",
  "error": null,
  "data": { ... }
}
```

### Example Response

A real response from the Cryptogram Generator API:

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

## Support & Community

- 🏠 **API Home**: [Cryptogram Generator API](https://apiverve.com/marketplace/cryptogram?utm_source&#x3D;github&amp;utm_medium&#x3D;readme)
- 💬 **Support**: [https://apiverve.com/contact](https://apiverve.com/contact)
- 🐛 **Issues**: [GitHub Issues](../../issues)
- 📖 **Documentation**: [https://docs.apiverve.com](https://docs.apiverve.com)
- 🌐 **Website**: [https://apiverve.com](https://apiverve.com)

---

## Contributing

We welcome contributions! Please see [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines.

---

## Security

For security concerns, please review our [Security Policy](SECURITY.md).

---

## License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

---

## Acknowledgments

Built with ❤️ by [APIVerve](https://apiverve.com)

Copyright © 2026 APIVerve. All rights reserved.
