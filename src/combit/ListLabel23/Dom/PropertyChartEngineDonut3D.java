package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyChartEngineDonut3D extends PropertyChartEnginePieDonutBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setInnerRadiusPercentage (java.lang.String value){ try { javonetHandle.set("InnerRadiusPercentage",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getInnerRadiusPercentage (){ try { return  (java.lang.String) javonetHandle.get("InnerRadiusPercentage");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setXRotation (java.lang.String value){ try { javonetHandle.set("XRotation",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getXRotation (){ try { return  (java.lang.String) javonetHandle.get("XRotation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyValueAxisPie3D getYAxis (){ try { return new PropertyValueAxisPie3D((NObject)javonetHandle.<NObject>get("YAxis"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyChartEngineDonut3D (PropertyChartEngineBase item){  super((NObject) null); try {  javonetHandle = Javonet.New("PropertyChartEngineDonut3D",item); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyChartEngineDonut3D(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}