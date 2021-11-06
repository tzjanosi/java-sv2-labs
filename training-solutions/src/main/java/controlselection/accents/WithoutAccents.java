package controlselection.accents;

public class WithoutAccents {
    public char removeAccent(char c){
        char newChar;
        switch(c){
            case 'á':
                newChar='a';
                break;
            case 'Á':
                newChar='A';
                break;
            case 'é':
                newChar='e';
                break;
            case 'É':
                newChar='E';
                break;
            case 'í':
                newChar='i';
                break;
            case 'Í':
                newChar='I';
                break;
            case 'ó':
            case 'ö':
            case 'ő':
                newChar='o';
                break;
            case 'Ó':
            case 'Ö':
            case 'Ő':
                newChar='O';
                break;
            case 'ú':
            case 'ü':
            case 'ű':
                newChar='u';
                break;
            case 'Ú':
            case 'Ü':
            case 'Ű':
                newChar='U';
                break;
            default:
                newChar=c;
        }
        return newChar;
    }
}
