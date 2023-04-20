package S_6;

public class OS {
    public String osName;
    public String osVersion;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof OS)
            return (((OS) obj).osName.equals(this.osName) &&
                    ((OS) obj).osVersion.equals(this.osVersion));
        else return  false;
    }

    public OS(String nameOwner, String phone) {
        this.osName = nameOwner;
        this.osVersion = phone;
    }
    @Override
    public String toString(){return String.format("Операционная система: {osName: %s, osVersion: %s}", osName, osVersion);}
}
