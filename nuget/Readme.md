CryptogramGenerator API
============

Cryptogram Generator creates letter substitution cipher puzzles where each letter is replaced with another letter consistently throughout the text.

![Build Status](https://img.shields.io/badge/build-passing-green)
![Code Climate](https://img.shields.io/badge/maintainability-B-purple)
![Prod Ready](https://img.shields.io/badge/production-ready-blue)

This is a .NET Wrapper for the [CryptogramGenerator API](https://apiverve.com/marketplace/cryptogram?utm_source=nuget&utm_medium=readme)

---

## Installation

Using the .NET CLI:
```
dotnet add package APIVerve.API.CryptogramGenerator
```

Using the Package Manager:
```
nuget install APIVerve.API.CryptogramGenerator
```

Using the Package Manager Console:
```
Install-Package APIVerve.API.CryptogramGenerator
```

From within Visual Studio:

1. Open the Solution Explorer
2. Right-click on a project within your solution
3. Click on Manage NuGet Packages
4. Click on the Browse tab and search for "APIVerve.API.CryptogramGenerator"
5. Click on the APIVerve.API.CryptogramGenerator package, select the appropriate version in the right-tab and click Install

---

## Configuration

Before using the cryptogram API client, you have to setup your account and obtain your API Key.
You can get it by signing up at [https://apiverve.com](https://apiverve.com?utm_source=nuget&utm_medium=readme)

---

## Quick Start

Here's a simple example to get you started quickly:

```csharp
using System;
using APIVerve.API.CryptogramGenerator;

class Program
{
    static async Task Main(string[] args)
    {
        // Initialize the API client
        var apiClient = new CryptogramGeneratorAPIClient("[YOUR_API_KEY]");

        var queryOptions = new CryptogramGeneratorQueryOptions {
    Text = "The quick brown fox",
    Random = true,
    Image = true,
    SolutionImage = true
};

        // Make the API call
        try
        {
            var response = await apiClient.ExecuteAsync(queryOptions);

            if (response.Error != null)
            {
                Console.WriteLine($"API Error: {response.Error}");
            }
            else
            {
                Console.WriteLine("Success!");
                // Access response data using the strongly-typed ResponseObj properties
                Console.WriteLine(Newtonsoft.Json.JsonConvert.SerializeObject(response, Newtonsoft.Json.Formatting.Indented));
            }
        }
        catch (Exception ex)
        {
            Console.WriteLine($"Exception: {ex.Message}");
        }
    }
}
```

---

## Usage

The CryptogramGenerator API documentation is found here: [https://docs.apiverve.com/ref/cryptogram](https://docs.apiverve.com/ref/cryptogram?utm_source=nuget&utm_medium=readme).
You can find parameters, example responses, and status codes documented here.

### Setup

###### Authentication
CryptogramGenerator API uses API Key-based authentication. When you create an instance of the API client, you can pass your API Key as a parameter.

```csharp
// Create an instance of the API client
var apiClient = new CryptogramGeneratorAPIClient("[YOUR_API_KEY]");
```

---

## Usage Examples

### Basic Usage (Async/Await Pattern - Recommended)

The modern async/await pattern provides the best performance and code readability:

```csharp
using System;
using System.Threading.Tasks;
using APIVerve.API.CryptogramGenerator;

public class Example
{
    public static async Task Main(string[] args)
    {
        var apiClient = new CryptogramGeneratorAPIClient("[YOUR_API_KEY]");

        var queryOptions = new CryptogramGeneratorQueryOptions {
    Text = "The quick brown fox",
    Random = true,
    Image = true,
    SolutionImage = true
};

        var response = await apiClient.ExecuteAsync(queryOptions);

        if (response.Error != null)
        {
            Console.WriteLine($"Error: {response.Error}");
        }
        else
        {
            Console.WriteLine(Newtonsoft.Json.JsonConvert.SerializeObject(response, Newtonsoft.Json.Formatting.Indented));
        }
    }
}
```

### Synchronous Usage

If you need to use synchronous code, you can use the `Execute` method:

```csharp
using System;
using APIVerve.API.CryptogramGenerator;

public class Example
{
    public static void Main(string[] args)
    {
        var apiClient = new CryptogramGeneratorAPIClient("[YOUR_API_KEY]");

        var queryOptions = new CryptogramGeneratorQueryOptions {
    Text = "The quick brown fox",
    Random = true,
    Image = true,
    SolutionImage = true
};

        var response = apiClient.Execute(queryOptions);

        if (response.Error != null)
        {
            Console.WriteLine($"Error: {response.Error}");
        }
        else
        {
            Console.WriteLine(Newtonsoft.Json.JsonConvert.SerializeObject(response, Newtonsoft.Json.Formatting.Indented));
        }
    }
}
```

---

## Error Handling

The API client provides comprehensive error handling. Here are some examples:

### Handling API Errors

```csharp
using System;
using System.Threading.Tasks;
using APIVerve.API.CryptogramGenerator;

public class Example
{
    public static async Task Main(string[] args)
    {
        var apiClient = new CryptogramGeneratorAPIClient("[YOUR_API_KEY]");

        var queryOptions = new CryptogramGeneratorQueryOptions {
    Text = "The quick brown fox",
    Random = true,
    Image = true,
    SolutionImage = true
};

        try
        {
            var response = await apiClient.ExecuteAsync(queryOptions);

            // Check for API-level errors
            if (response.Error != null)
            {
                Console.WriteLine($"API Error: {response.Error}");
                Console.WriteLine($"Status: {response.Status}");
                return;
            }

            // Success - use the data
            Console.WriteLine("Request successful!");
            Console.WriteLine(Newtonsoft.Json.JsonConvert.SerializeObject(response, Newtonsoft.Json.Formatting.Indented));
        }
        catch (ArgumentException ex)
        {
            // Invalid API key or parameters
            Console.WriteLine($"Invalid argument: {ex.Message}");
        }
        catch (System.Net.Http.HttpRequestException ex)
        {
            // Network or HTTP errors
            Console.WriteLine($"Network error: {ex.Message}");
        }
        catch (Exception ex)
        {
            // Other errors
            Console.WriteLine($"Unexpected error: {ex.Message}");
        }
    }
}
```

### Comprehensive Error Handling with Retry Logic

```csharp
using System;
using System.Threading.Tasks;
using APIVerve.API.CryptogramGenerator;

public class Example
{
    public static async Task Main(string[] args)
    {
        var apiClient = new CryptogramGeneratorAPIClient("[YOUR_API_KEY]");

        // Configure retry behavior (max 3 retries)
        apiClient.SetMaxRetries(3);        // Retry up to 3 times (default: 0, max: 3)
        apiClient.SetRetryDelay(2000);     // Wait 2 seconds between retries

        var queryOptions = new CryptogramGeneratorQueryOptions {
    Text = "The quick brown fox",
    Random = true,
    Image = true,
    SolutionImage = true
};

        try
        {
            var response = await apiClient.ExecuteAsync(queryOptions);

            if (response.Error != null)
            {
                Console.WriteLine($"API Error: {response.Error}");
            }
            else
            {
                Console.WriteLine("Success!");
                Console.WriteLine(Newtonsoft.Json.JsonConvert.SerializeObject(response, Newtonsoft.Json.Formatting.Indented));
            }
        }
        catch (Exception ex)
        {
            Console.WriteLine($"Failed after retries: {ex.Message}");
        }
    }
}
```

---

## Advanced Features

### Custom Headers

Add custom headers to your requests:

```csharp
var apiClient = new CryptogramGeneratorAPIClient("[YOUR_API_KEY]");

// Add custom headers
apiClient.AddCustomHeader("X-Custom-Header", "custom-value");
apiClient.AddCustomHeader("X-Request-ID", Guid.NewGuid().ToString());

var queryOptions = new CryptogramGeneratorQueryOptions {
    Text = "The quick brown fox",
    Random = true,
    Image = true,
    SolutionImage = true
};

var response = await apiClient.ExecuteAsync(queryOptions);

// Remove a header
apiClient.RemoveCustomHeader("X-Custom-Header");

// Clear all custom headers
apiClient.ClearCustomHeaders();
```

### Request Logging

Enable logging for debugging:

```csharp
var apiClient = new CryptogramGeneratorAPIClient("[YOUR_API_KEY]", isDebug: true);

// Or use a custom logger
apiClient.SetLogger(message =>
{
    Console.WriteLine($"[LOG] {DateTime.Now:yyyy-MM-dd HH:mm:ss} - {message}");
});

var queryOptions = new CryptogramGeneratorQueryOptions {
    Text = "The quick brown fox",
    Random = true,
    Image = true,
    SolutionImage = true
};

var response = await apiClient.ExecuteAsync(queryOptions);
```

### Retry Configuration

Customize retry behavior for failed requests:

```csharp
var apiClient = new CryptogramGeneratorAPIClient("[YOUR_API_KEY]");

// Set retry options
apiClient.SetMaxRetries(3);           // Retry up to 3 times (default: 0, max: 3)
apiClient.SetRetryDelay(1500);        // Wait 1.5 seconds between retries (default: 1000ms)

var queryOptions = new CryptogramGeneratorQueryOptions {
    Text = "The quick brown fox",
    Random = true,
    Image = true,
    SolutionImage = true
};

var response = await apiClient.ExecuteAsync(queryOptions);
```

### Dispose Pattern

The API client implements `IDisposable` for proper resource cleanup:

```csharp
var queryOptions = new CryptogramGeneratorQueryOptions {
    Text = "The quick brown fox",
    Random = true,
    Image = true,
    SolutionImage = true
};

using (var apiClient = new CryptogramGeneratorAPIClient("[YOUR_API_KEY]"))
{
    var response = await apiClient.ExecuteAsync(queryOptions);
    Console.WriteLine(Newtonsoft.Json.JsonConvert.SerializeObject(response, Newtonsoft.Json.Formatting.Indented));
}
// HttpClient is automatically disposed here
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

Need any assistance? [Get in touch with Customer Support](https://apiverve.com/contact?utm_source=nuget&utm_medium=readme).

---

## Updates
Stay up to date by following [@apiverveHQ](https://twitter.com/apiverveHQ) on Twitter.

---

## Legal

All usage of the APIVerve website, API, and services is subject to the [APIVerve Terms of Service](https://apiverve.com/terms?utm_source=nuget&utm_medium=readme) and all legal documents and agreements.

---

## License
Licensed under the The MIT License (MIT)

Copyright (&copy;) 2026 APIVerve, and EvlarSoft LLC

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
