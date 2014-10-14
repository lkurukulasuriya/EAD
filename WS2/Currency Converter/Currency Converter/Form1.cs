using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using Currency_Converter;

namespace Currency_Converter
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            CurrencyConverter.CurrencyConvertorSoapClient client = new CurrencyConverter.CurrencyConvertorSoapClient("CurrencyConvertorSoap");
            
            double result = client.ConversionRate(CurrencyConverter.Currency.USD, CurrencyConverter.Currency.LKR);
            MessageBox.Show(result.ToString());
            
        }
    }
}
