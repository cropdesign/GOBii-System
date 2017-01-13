package org.gobiiproject.gobiimodel.headerlesscontainer;

import org.gobiiproject.gobiimodel.tobemovedtoapimodel.Header;
import org.gobiiproject.gobiimodel.dto.instructions.loader.GobiiLoaderInstruction;
import org.gobiiproject.gobiimodel.types.GobiiProcessType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Phil on 4/8/2016.
 */
public class LoaderInstructionFilesDTO extends DTOBase {


    private List<GobiiLoaderInstruction> gobiiLoaderInstructions = new ArrayList<>();
    private String instructionFileName = null;


    @Override
    public Integer getId() {
        return 1;
    }

    @Override
    public void setId(Integer id) {
        ;
    }

    public List<GobiiLoaderInstruction> getGobiiLoaderInstructions() {
        return gobiiLoaderInstructions;
    }

    public void setGobiiLoaderInstructions(List<GobiiLoaderInstruction> gobiiLoaderInstructions) {
        this.gobiiLoaderInstructions = gobiiLoaderInstructions;
    }

    public String getInstructionFileName() {
        return instructionFileName;
    }

    public void setInstructionFileName(String instructionFileName) {
        this.instructionFileName = instructionFileName;
    }

}
