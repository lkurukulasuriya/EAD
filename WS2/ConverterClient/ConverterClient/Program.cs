using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ConverterClient
{
    class Program
    {
        static void Main(string[] args)
        {
            //ConverterReference.MyConverterClient cnvrtClient = new ConverterReference.MyConverterClient();
            //Console.WriteLine(cnvrtClient.convertCToF(100));
            //Console.ReadLine();

            TConverterServiceReference.TConverterWebServiceClient tConvClient = new TConverterServiceReference.TConverterWebServiceClient();
            Console.WriteLine(tConvClient.convertCToF(0));
            Console.ReadLine();
        }
    }
}
