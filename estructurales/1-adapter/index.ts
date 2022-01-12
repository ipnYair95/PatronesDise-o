
// =============== Adapter Pattern ===============

interface IPhone {
  useLightning();
}

interface Android {
  useUSBc();
}

class IPhoneXs implements IPhone {
  useLightning() {
    console.log("Using lightning port..");
  }
}

class GooglePixel3 implements Android {
  useUSBc() {
    console.log("Using USB-C port..");
  }
}

// -------------------- Adapter class --------------------

class LightningToMicroUSBAdapter implements Android {
  iphoneDevice: IPhone;

  constructor(iphone: IPhone) {
    this.iphoneDevice = iphone;
  }

  useUSBc() {
    console.log('Want to use USBc, converting...');
    this.iphoneDevice.useLightning();
  }
}


class LightningToMicroUSBAdapter2 implements Android {
    androidDevice: GooglePixel3;

    constructor( android: GooglePixel3 ){
        this.androidDevice = android
    }

    useUSBc() {
        console.log('Want to use USBc, converting...');
        this.androidDevice.useUSBc();
    }}

  }

// --------------------------------------------------------

let iphone = new IPhoneXs();
let chargeAdaptor = new LightningToMicroUSBAdapter(iphone);

let android = new GooglePixel3();
let chargeAdaptador2 = new LightningToMicroUSBAdapter2(android);

console.log("I use iphone charger");
chargeAdaptor.useUSBc();

console.log("I use mini usb");
chargeAdaptador2.useUSBc();