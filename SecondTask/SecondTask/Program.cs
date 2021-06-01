using System;

namespace SecondTask
{
    class Program
    {
        static void Main(string[] args)
        {
            
        }

        public static int CalculateNetSalary(int grossValue)
        {
            int taxes = 0;
            // Checking for income tax.
            if (grossValue > 1000)
            {
                int excess = grossValue - 1000;
                taxes = (int) Math.Round(excess * 0.1);
            }

            // Checking for social contributions.
            if (grossValue > 1000 && grossValue <= 3000)
            {
                taxes = (int)Math.Round(grossValue * 0.15);
            }else if (grossValue > 3000)
            {
                int taxableIncome = 3000;
                taxes = (int)Math.Round(taxableIncome * 0.15);
            }

            // For implementing new taxes add new if else statements.

            return grossValue - taxes;
        }
    }
}
