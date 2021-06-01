using System;
using System.Collections.Generic;
using System.IO;
using Newtonsoft.Json;

namespace FirstTask
{
    public class Program
    {
        static void Main(string[] args)
        {
            string jsonInput = File.ReadAllText("../../../input.txt");

            var movieStars = JsonConvert.DeserializeObject<MovieStar[]>(jsonInput);

            foreach (MovieStar movieStar in movieStars)
            {
                Console.WriteLine(movieStar.ToString() + Environment.NewLine);
            }
        }
    }
}
