class Main {
  public static void main(String[] args) {
    I[] array = {new Turbo(new car()), new Radio(new Turbo(new car())),
                new Nitro(new Stereo(new WiFi(new car())))};
        for (I anArray : array) {
            anArray.doIt();
            System.out.print(".\n");
        }
  }
}

interface I {
  void doIt();
}

class car implements I { // Base car
    public void doIt() { 
        System.out.print("This car has: "); 
    } 
}

abstract class D implements I {//Decorator
    private I core;
    public D(I inner) {
      core = inner;
    }

    public void doIt() {
      core.doIt();
    }
}

class Radio extends D {//1
    public Radio(I inner) {
        super(inner);
    }

    public void doIt() {
        super.doIt();
        doRadio();
    }

    private void doRadio() {
        System.out.print(" Radio");
    }
}

class Turbo extends D {//2
    public Turbo(I inner) {
        super(inner);
    }

    public void doIt()  {
        super.doIt();
        doTurbo();
    }

    private void doTurbo() {
        System.out.print(" Turbo");
    }
}

class Nitro extends D {//3
    public Nitro(I inner) {
        super(inner);
    }

    public void doIt()  {
        super.doIt();
        doNitro();
    }

    private void doNitro() {
        System.out.print(" Nitro");
    }
}

class Stereo extends D {//4
    public Stereo(I inner) {
        super(inner);
    }

    public void doIt()  {
        super.doIt();
        doStereo();
    }

    private void doStereo() {
        System.out.print(" Stereo");
    }
}

class Chrome extends D {//5
    public Chrome(I inner) {
        super(inner);
    }

    public void doIt()  {
        super.doIt();
        doChrome();
    }

    private void doChrome() {
        System.out.print(" Chrome");
    }
}

class TV extends D {//6
    public TV(I inner) {
        super(inner);
    }

    public void doIt()  {
        super.doIt();
        doTV();
    }

    private void doTV() {
        System.out.print(" TV");
    }
}

class WiFi extends D {//7
    public WiFi(I inner) {
        super(inner);
    }

    public void doIt()  {
        super.doIt();
        doWiFi();
    }

    private void doWiFi() {
        System.out.print(" WiFi");
    }
}

class BlueTooth extends D {//8
    public BlueTooth(I inner) {
        super(inner);
    }

    public void doIt()  {
        super.doIt();
        doBlueTooth();
    }

    private void doBlueTooth() {
        System.out.print(" BlueTooth");
    }
}

class Neon extends D {//9
    public Neon(I inner) {
        super(inner);
    }

    public void doIt()  {
        super.doIt();
        doNeon();
    }

    private void doNeon() {
        System.out.print(" Neon");
    }
}

class Spoiler extends D {//9
    public Spoiler(I inner) {
        super(inner);
    }

    public void doIt()  {
        super.doIt();
        doSpoiler();
    }

    private void doSpoiler() {
        System.out.print(" Spoiler");
    }
}