package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.Forms.*;
import combit.ListLabel23.*;
import jio.System.*;public class DesignerControl extends Control {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setParentComponent (ListLabel value){ try { javonetHandle.set("ParentComponent",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ListLabel getParentComponent (){ try { return new ListLabel((NObject)javonetHandle.<NObject>get("ParentComponent"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public DesignerControl (){  super((NObject) null); try {  javonetHandle = Javonet.New("DesignerControl"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("DesignerOpening", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<EventArgs> handler : _DesignerOpeningListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], EventArgs.class));}}});javonetHandle.addEventListener("DesignerClosing", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<EventArgs> handler : _DesignerClosingListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], EventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DesignerControl(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean CanClose (){ try { return javonetHandle.invoke("CanClose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void Save (){ try { javonetHandle.invoke("Save");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<EventArgs>> _DesignerOpeningListeners = new java.util.ArrayList<EventHandler<EventArgs>>();

            public void addDesignerOpening(EventHandler<EventArgs> toAdd)
            {
                _DesignerOpeningListeners.add(toAdd);
            }
            public void removeDesignerOpening(EventHandler<EventArgs> toRemove)
            {
                _DesignerOpeningListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<EventArgs>> _DesignerClosingListeners = new java.util.ArrayList<EventHandler<EventArgs>>();

            public void addDesignerClosing(EventHandler<EventArgs> toAdd)
            {
                _DesignerClosingListeners.add(toAdd);
            }
            public void removeDesignerClosing(EventHandler<EventArgs> toRemove)
            {
                _DesignerClosingListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}