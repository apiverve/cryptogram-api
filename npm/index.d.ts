declare module '@apiverve/cryptogram' {
  export interface cryptogramOptions {
    api_key: string;
    secure?: boolean;
  }

  /**
   * Describes fields the current plan does not unlock. Locked fields arrive as null
   * in `data`; `locked_fields` names them, using dot paths for nested fields.
   * Absent when the plan unlocks everything.
   */
  export interface PremiumInfo {
    message: string;
    upgrade_url: string;
    locked_fields: string[];
  }

  export interface cryptogramResponse {
    status: string;
    error: string | null;
    data: CryptogramGeneratorData;
    code?: number;
    premium?: PremiumInfo;
  }


  interface CryptogramGeneratorData {
      encoded:       null | string;
      original:      null | string;
      cipher:        { [key: string]: null | string };
      letterCount:   number | null;
      wordCount:     number | null;
      html:          null | string;
      image:         Image;
      solutionImage: Image;
  }
  
  interface Image {
      imageName:   null | string;
      format:      null | string;
      downloadURL: null | string;
      expires:     number | null;
  }

  export default class cryptogramWrapper {
    constructor(options: cryptogramOptions);

    execute(callback: (error: any, data: cryptogramResponse | null) => void): Promise<cryptogramResponse>;
    execute(query: Record<string, any>, callback: (error: any, data: cryptogramResponse | null) => void): Promise<cryptogramResponse>;
    execute(query?: Record<string, any>): Promise<cryptogramResponse>;
  }
}
