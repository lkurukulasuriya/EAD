﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.34014
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace ConverterClient.TConverterServiceReference {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(Namespace="http://ws.example.dulanjaya.lk/", ConfigurationName="TConverterServiceReference.TConverterWebService")]
    public interface TConverterWebService {
        
        // CODEGEN: Generating message contract since message part namespace () does not match the default value (http://ws.example.dulanjaya.lk/)
        [System.ServiceModel.OperationContractAttribute(Action="http://ws.example.dulanjaya.lk/TConverterWebService/convertCToFRequest", ReplyAction="http://ws.example.dulanjaya.lk/TConverterWebService/convertCToFResponse")]
        [return: System.ServiceModel.MessageParameterAttribute(Name="return")]
        ConverterClient.TConverterServiceReference.convertCToFResponse convertCToF(ConverterClient.TConverterServiceReference.convertCToFRequest request);
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="convertCToF", WrapperNamespace="http://ws.example.dulanjaya.lk/", IsWrapped=true)]
    public partial class convertCToFRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="", Order=0)]
        public double value;
        
        public convertCToFRequest() {
        }
        
        public convertCToFRequest(double value) {
            this.value = value;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="convertCToFResponse", WrapperNamespace="http://ws.example.dulanjaya.lk/", IsWrapped=true)]
    public partial class convertCToFResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="", Order=0)]
        public double @return;
        
        public convertCToFResponse() {
        }
        
        public convertCToFResponse(double @return) {
            this.@return = @return;
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface TConverterWebServiceChannel : ConverterClient.TConverterServiceReference.TConverterWebService, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class TConverterWebServiceClient : System.ServiceModel.ClientBase<ConverterClient.TConverterServiceReference.TConverterWebService>, ConverterClient.TConverterServiceReference.TConverterWebService {
        
        public TConverterWebServiceClient() {
        }
        
        public TConverterWebServiceClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public TConverterWebServiceClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public TConverterWebServiceClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public TConverterWebServiceClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        ConverterClient.TConverterServiceReference.convertCToFResponse ConverterClient.TConverterServiceReference.TConverterWebService.convertCToF(ConverterClient.TConverterServiceReference.convertCToFRequest request) {
            return base.Channel.convertCToF(request);
        }
        
        public double convertCToF(double value) {
            ConverterClient.TConverterServiceReference.convertCToFRequest inValue = new ConverterClient.TConverterServiceReference.convertCToFRequest();
            inValue.value = value;
            ConverterClient.TConverterServiceReference.convertCToFResponse retVal = ((ConverterClient.TConverterServiceReference.TConverterWebService)(this)).convertCToF(inValue);
            return retVal.@return;
        }
    }
}