
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4a.example.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _splashtimer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _contador = RemoteObject.createImmutable(0);
public static RemoteObject _panellogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _splashlogo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _animacionarriba = RemoteObject.declareNull("flm.b4a.animationplus.AnimationPlusWrapper");
public static RemoteObject _animaciones = RemoteObject.declareNull("flm.b4a.animationplus.AnimationSet");
public static b4a.example.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"AnimacionArriba",main.mostCurrent._animacionarriba,"Animaciones",main.mostCurrent._animaciones,"Contador",main._contador,"Label1",main.mostCurrent._label1,"PanelLogin",main.mostCurrent._panellogin,"SplashLogo",main.mostCurrent._splashlogo,"SplashTimer",main._splashtimer,"Starter",Debug.moduleToString(b4a.example.starter.class)};
}
}