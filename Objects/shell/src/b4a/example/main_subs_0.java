package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"Splash\")'";
Debug.ShouldStop(1);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Splash")),main.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,45);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,36);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Animaciones.Initialize(False)";
Debug.ShouldStop(16);
main.mostCurrent._animaciones.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 38;BA.debugLine="AnimacionArriba.InitializeTranslate(\"AnimacionArri";
Debug.ShouldStop(32);
main.mostCurrent._animacionarriba.runVoidMethod ("InitializeTranslate",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("AnimacionArriba")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, -(double) (0 + main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 22)),main.mostCurrent.activityBA).<Integer>get().intValue()))));
 BA.debugLineNum = 39;BA.debugLine="Animaciones.AddAnimation(AnimacionArriba)";
Debug.ShouldStop(64);
main.mostCurrent._animaciones.runVoidMethod ("AddAnimation",(Object)(main.mostCurrent._animacionarriba));
 BA.debugLineNum = 40;BA.debugLine="Animaciones.Duration = 1000";
Debug.ShouldStop(128);
main.mostCurrent._animaciones.runMethod(true,"setDuration",BA.numberCast(long.class, 1000));
 BA.debugLineNum = 41;BA.debugLine="Animaciones.PersistAfter = True";
Debug.ShouldStop(256);
main.mostCurrent._animaciones.runMethod(true,"setPersistAfter",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 42;BA.debugLine="Animaciones.Start(SplashLogo)";
Debug.ShouldStop(512);
main.mostCurrent._animaciones.runVoidMethod ("Start",(Object)((main.mostCurrent._splashlogo.getObject())));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _animacionarriba_animationend() throws Exception{
try {
		Debug.PushSubsStack("AnimacionArriba_AnimationEnd (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,52);
if (RapidSub.canDelegate("animacionarriba_animationend")) return main.remoteMe.runUserSub(false, "main","animacionarriba_animationend");
 BA.debugLineNum = 52;BA.debugLine="Sub AnimacionArriba_AnimationEnd";
Debug.ShouldStop(524288);
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 21;BA.debugLine="Private PanelLogin As Panel";
main.mostCurrent._panellogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private SplashLogo As ImageView";
main.mostCurrent._splashlogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Label1 As Label";
main.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Dim AnimacionArriba As AnimationPlus";
main.mostCurrent._animacionarriba = RemoteObject.createNew ("flm.b4a.animationplus.AnimationPlusWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim Animaciones As AnimationSet";
main.mostCurrent._animaciones = RemoteObject.createNew ("flm.b4a.animationplus.AnimationSet");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 15;BA.debugLine="Dim SplashTimer As Timer";
main._splashtimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 16;BA.debugLine="Dim Contador  As Int";
main._contador = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _splashtimer_tick() throws Exception{
try {
		Debug.PushSubsStack("SplashTimer_Tick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,49);
if (RapidSub.canDelegate("splashtimer_tick")) return main.remoteMe.runUserSub(false, "main","splashtimer_tick");
 BA.debugLineNum = 49;BA.debugLine="Sub SplashTimer_Tick'";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}