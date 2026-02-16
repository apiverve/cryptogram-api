/// Response models for the Cryptogram Generator API.

/// API Response wrapper.
class CryptogramResponse {
  final String status;
  final dynamic error;
  final CryptogramData? data;

  CryptogramResponse({
    required this.status,
    this.error,
    this.data,
  });

  factory CryptogramResponse.fromJson(Map<String, dynamic> json) => CryptogramResponse(
    status: json['status'] as String? ?? '',
    error: json['error'],
    data: json['data'] != null ? CryptogramData.fromJson(json['data']) : null,
  );

  Map<String, dynamic> toJson() => {
    'status': status,
    if (error != null) 'error': error,
    if (data != null) 'data': data,
  };
}

/// Response data for the Cryptogram Generator API.

class CryptogramData {
  String? encoded;
  String? original;
  CryptogramDataCipher? cipher;
  int? letterCount;
  int? wordCount;
  String? html;
  CryptogramDataImage? image;
  CryptogramDataSolutionimage? solutionImage;

  CryptogramData({
    this.encoded,
    this.original,
    this.cipher,
    this.letterCount,
    this.wordCount,
    this.html,
    this.image,
    this.solutionImage,
  });

  factory CryptogramData.fromJson(Map<String, dynamic> json) => CryptogramData(
      encoded: json['encoded'],
      original: json['original'],
      cipher: json['cipher'] != null ? CryptogramDataCipher.fromJson(json['cipher']) : null,
      letterCount: json['letterCount'],
      wordCount: json['wordCount'],
      html: json['html'],
      image: json['image'] != null ? CryptogramDataImage.fromJson(json['image']) : null,
      solutionImage: json['solutionImage'] != null ? CryptogramDataSolutionimage.fromJson(json['solutionImage']) : null,
    );
}

class CryptogramDataCipher {
  String? A;
  String? B;
  String? C;
  String? D;
  String? E;
  String? F;
  String? G;
  String? H;
  String? I;
  String? J;
  String? K;
  String? L;
  String? M;
  String? N;
  String? O;
  String? P;
  String? Q;
  String? R;
  String? S;
  String? T;
  String? U;
  String? V;
  String? W;
  String? X;
  String? Y;
  String? Z;

  CryptogramDataCipher({
    this.A,
    this.B,
    this.C,
    this.D,
    this.E,
    this.F,
    this.G,
    this.H,
    this.I,
    this.J,
    this.K,
    this.L,
    this.M,
    this.N,
    this.O,
    this.P,
    this.Q,
    this.R,
    this.S,
    this.T,
    this.U,
    this.V,
    this.W,
    this.X,
    this.Y,
    this.Z,
  });

  factory CryptogramDataCipher.fromJson(Map<String, dynamic> json) => CryptogramDataCipher(
      A: json['A'],
      B: json['B'],
      C: json['C'],
      D: json['D'],
      E: json['E'],
      F: json['F'],
      G: json['G'],
      H: json['H'],
      I: json['I'],
      J: json['J'],
      K: json['K'],
      L: json['L'],
      M: json['M'],
      N: json['N'],
      O: json['O'],
      P: json['P'],
      Q: json['Q'],
      R: json['R'],
      S: json['S'],
      T: json['T'],
      U: json['U'],
      V: json['V'],
      W: json['W'],
      X: json['X'],
      Y: json['Y'],
      Z: json['Z'],
    );
}

class CryptogramDataImage {
  String? imageName;
  String? format;
  String? downloadURL;
  int? expires;

  CryptogramDataImage({
    this.imageName,
    this.format,
    this.downloadURL,
    this.expires,
  });

  factory CryptogramDataImage.fromJson(Map<String, dynamic> json) => CryptogramDataImage(
      imageName: json['imageName'],
      format: json['format'],
      downloadURL: json['downloadURL'],
      expires: json['expires'],
    );
}

class CryptogramDataSolutionimage {
  String? imageName;
  String? format;
  String? downloadURL;
  int? expires;

  CryptogramDataSolutionimage({
    this.imageName,
    this.format,
    this.downloadURL,
    this.expires,
  });

  factory CryptogramDataSolutionimage.fromJson(Map<String, dynamic> json) => CryptogramDataSolutionimage(
      imageName: json['imageName'],
      format: json['format'],
      downloadURL: json['downloadURL'],
      expires: json['expires'],
    );
}

class CryptogramRequest {
  String? text;
  bool? random;

  CryptogramRequest({
    this.text,
    this.random,
  });

  Map<String, dynamic> toJson() => {
      if (text != null) 'text': text,
      if (random != null) 'random': random,
    };
}
