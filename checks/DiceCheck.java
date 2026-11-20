public class DiceCheck {
 public static void main(String[] args) throws Exception {

 carascruces.Dado dado=new carascruces.Dado(){int i;public int generaAleatorio(){return new int[]{1,2,3,6}[i++ % 4];}};
 carascruces.Juego juego=new carascruces.Juego(dado);juego.getYo().setNombreJugador("A");juego.getYo2().setNombreJugador("B");
 CheckSupport.check(juego.turno().contains("A"),"Player one starts");juego.turno();juego.turno();juego.turno();
 CheckSupport.equal(juego.getYo().getPosicion(),1);CheckSupport.equal(juego.getYo2().getPosicion(),2);
 juego.setTurno(1);CheckSupport.equal(juego.cambiaTurno(),2);CheckSupport.equal(juego.cambiaTurno(),1);
 try {juego.setTurno(0);throw new AssertionError();}catch(IllegalArgumentException expected){}
 for(int i=0;i<1000;i++){int n=new carascruces.Dado().generaAleatorio();CheckSupport.check(n>=1&&n<=6,"Dice bounds");}

 CheckSupport.done();
 }
}
