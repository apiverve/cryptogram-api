using System;
using System.Collections.Generic;
using System.Text;
using Newtonsoft.Json;

namespace APIVerve.API.CryptogramGenerator
{
    /// <summary>
    /// Query options for the Cryptogram Generator API
    /// </summary>
    public class CryptogramGeneratorQueryOptions
    {
        /// <summary>
        /// Text to encode (max 500 characters)
        /// Example: The quick brown fox
        /// </summary>
        [JsonProperty("text")]
        public string Text { get; set; }

        /// <summary>
        /// Use a random famous quote
        /// Example: true
        /// </summary>
        [JsonProperty("random")]
        public string Random { get; set; }
    }
}
