package table.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "userGroup")
public class UserGroup implements Serializable {
    @Id
    @Column(name="groupId")
    private int groupId;
    @Id
    @Column(name="userId")
    private int userId;
    @Column(name = "statusName")
    private String statusName;
    @Column(name = "canEditUserList")
    private boolean canEditUserList;
    @Column(name = "canWithdrawMoney")
    private boolean canWithdrawMoney;
    @Column(name = "isAdmin")
    private boolean isAdmin;

    public UserGroup(){
    }
    public UserGroup(int groupId, int userId, String statusName, boolean canEditUserList, boolean canWithdrawMoney, boolean isAdmin) {
        this.groupId = groupId;
        this.userId = userId;
        this.statusName = statusName;
        this.canEditUserList = canEditUserList;
        this.canWithdrawMoney = canWithdrawMoney;
        this.isAdmin = isAdmin;
    }
    public int getGroupId() {
        return groupId;
    }
    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getStatusName() {
        return statusName;
    }
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
    public boolean isCanEditUserList() {
        return canEditUserList;
    }
    public void setCanEditUserList(boolean canEditUserList) {
        this.canEditUserList = canEditUserList;
    }
    public boolean isCanWithdrawMoney() {
        return canWithdrawMoney;
    }
    public void setCanWithdrawMoney(boolean canWithdrawMoney) {
        this.canWithdrawMoney = canWithdrawMoney;
    }
    public boolean isAdmin() {
        return isAdmin;
    }
    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
