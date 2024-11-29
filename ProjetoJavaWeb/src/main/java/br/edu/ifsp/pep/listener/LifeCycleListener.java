package br.edu.ifsp.pep.listener;

import jakarta.faces.context.FacesContext;
import jakarta.faces.event.PhaseEvent;
import jakarta.faces.event.PhaseId;
import jakarta.faces.event.PhaseListener;
import java.io.IOException;

public class LifeCycleListener implements PhaseListener {

    @Override
    public void afterPhase(PhaseEvent event) {
        PhaseListener.super.afterPhase(event);
    }
    
    @Override
    public void beforePhase(PhaseEvent event) {
        PhaseListener.super.beforePhase(event);
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

    private void redirecionar(FacesContext ctx, String pagina) {
        try {
            //Nome do projeto
            String projeto = ctx.getExternalContext()
                    .getRequestContextPath();

            //Encaminhar/Redirecionar
            ctx.getExternalContext().redirect(projeto + pagina);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
