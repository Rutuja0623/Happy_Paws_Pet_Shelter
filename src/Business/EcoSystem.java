/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.POJO.UserDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.POJO.IDGenerator;
import Business.POJO.PetsDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;


public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private UserDirectory ud;
    private PetsDirectory pd;
    private IDGenerator idgen;
    
    public static EcoSystem getInstance() {
                        System.out.println("I am here too");

        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public UserDirectory getUserDirInstance(){
        System.out.println("I am here too");

        if(ud==null){
            ud = new UserDirectory(); 
        }
        return ud;
    }
    
    public PetsDirectory getPetDirInstance(){
        if(pd==null){
            pd = new PetsDirectory();
            pd.getListOfPets();//creating empty array
        }
        return pd;
    }
    
    public IDGenerator getIdGenInstance(){
        if(idgen == null)
        {
            idgen = new IDGenerator();
        }
        return idgen;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    public Boolean checkifNetworkIsUnique(String name){
        return networkList.stream().noneMatch(nwk->nwk.getName().equalsIgnoreCase(name));
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        System.out.println("I am here too");

        networkList=new ArrayList<Network>();
        
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserDirInstance().checkIfUsernameIsUnique(userName)){
            return false;
        }
        return true;
    }
    public void removeNetwork(Network network) {
        networkList.remove(network);
    }
    
    public void updateNetwork(Network network,String name){
        for(Network n:networkList){
            if(n.equals(network)){
                n.setName(name);
            }
        }
    }
    public boolean isDuplicateNetwork(String name) {
     for(Network n:networkList){
            if(n.equals(name)){
                return true;
            }
        }    
    return false;
    }
}
