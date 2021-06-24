package me.architetto.enhancedfurnace.listener;

import org.bukkit.block.Furnace;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class FurnaceStartSmeltEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    private final Furnace furnace;

    private boolean isCancelled;

    public FurnaceStartSmeltEvent(Furnace furnace) {
        this.furnace = furnace;
        this.isCancelled = false;
    }

    public Furnace getFurnace() { return this.furnace; }

    @Override
    public boolean isCancelled() { return this.isCancelled; }

    @Override
    public void setCancelled(boolean cancelled) { this.isCancelled = cancelled; }

    @Override
    public HandlerList getHandlers() { return HANDLERS; }

    public static HandlerList getHandlerList() { return HANDLERS; }

}
