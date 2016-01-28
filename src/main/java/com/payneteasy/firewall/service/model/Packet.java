package com.payneteasy.firewall.service.model;

/**
 *
 */
public class Packet extends AbstractPacket {
    public String type;

    public String source_address;
    public String source_address_name;
    public String destination_address_name;

    public String input_interface;
    public String output_interface;

    public String source_nat_address;

    public String destination_nat_address;
    public int destination_nat_port;
    public String program;

    public String getSource_address_name() {
        return source_address_name;
    }

    public String getDestination_address_name() {
        return destination_address_name;
    }

    public String getProgram() {
        return program;
    }

    public String getType() {
        return type;
    }

    public String getSource_address() {
        return source_address;
    }

    public String getInput_interface() {
        return input_interface;
    }

    public String getOutput_interface() {
        return output_interface;
    }

    public String getSource_nat_address() {
        return source_nat_address;
    }

    public String getDestination_nat_address() {
        return destination_nat_address;
    }

    public int getDestination_nat_port() {
        return destination_nat_port;
    }
}
