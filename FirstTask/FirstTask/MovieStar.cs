using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FirstTask
{
    public class MovieStar
    {
        public DateTime dateOfBirth { get; set; }
        public string Name { get; set; }
        public string Surname { get; set; }
        public string Sex { get; set; }
        public string Nationality { get; set; }

        public override string ToString()
        {
            int yearsOld =(int)Math.Floor((DateTime.Now - this.dateOfBirth).Days / 365m);

            return
                $"{this.Name} {this.Surname}{Environment.NewLine}{this.Sex}{Environment.NewLine}{this.Nationality}{Environment.NewLine}{yearsOld} years old";
        }
    }
}
