declare module '@apiverve/cryptogram' {
  export interface cryptogramOptions {
    api_key: string;
    secure?: boolean;
  }

  export interface cryptogramResponse {
    status: string;
    error: string | null;
    data: CryptogramGeneratorData;
    code?: number;
  }


  interface CryptogramGeneratorData {
      encoded:       string;
      original:      string;
      cipher:        Cipher;
      letterCount:   number;
      wordCount:     number;
      html:          string;
      image:         Image;
      solutionImage: Image;
  }
  
  interface Cipher {
      a: string;
      b: string;
      c: string;
      d: string;
      e: string;
      f: string;
      g: string;
      h: string;
      i: string;
      j: string;
      k: string;
      l: string;
      m: string;
      n: string;
      o: string;
      p: string;
      q: string;
      r: string;
      s: string;
      t: string;
      u: string;
      v: string;
      w: string;
      x: string;
      y: string;
      z: string;
  }
  
  interface Image {
      imageName:   string;
      format:      string;
      downloadURL: string;
      expires:     number;
  }

  export default class cryptogramWrapper {
    constructor(options: cryptogramOptions);

    execute(callback: (error: any, data: cryptogramResponse | null) => void): Promise<cryptogramResponse>;
    execute(query: Record<string, any>, callback: (error: any, data: cryptogramResponse | null) => void): Promise<cryptogramResponse>;
    execute(query?: Record<string, any>): Promise<cryptogramResponse>;
  }
}
