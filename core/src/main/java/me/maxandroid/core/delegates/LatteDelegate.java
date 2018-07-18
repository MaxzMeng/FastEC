package me.maxandroid.core.delegates;

public abstract class LatteDelegate extends PermissionCheckerDelegate {
    public <T extends LatteDelegate> T getParentDelegate() {
        return (T) getParentFragment();
    }

}
