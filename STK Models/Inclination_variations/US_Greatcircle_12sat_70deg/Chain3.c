stk.v.10.0
WrittenBy    STK_v10.0.2

BEGIN Chain

Name  Chain3
BEGIN Definition

   Type        Chain
   Operator    Or
   Order       1
   Recompute   Yes
   IntervalType    0
   ComputeIntervalStart    0.000000
   ComputeIntervalStop     7300800.000000
    ComputeIntervalPtr
	BEGIN	EVENTINTERVAL
			BEGIN Interval
				Start	3 Dec 2013 01:00:00.000000000
				Stop	25 Feb 2014 13:00:00.000000000
			END Interval
			IntervalState	Explicit
	END	EVENTINTERVAL

   UseSaveIntervalFile    No
   UseMinAngle     No
   UseMaxAngle     No
   UseMinLinkTime     No
   LTDelayCriterion    2.000000
   TimeConvergence     0.005000
   AbsValueConvergence 1.000000e-014
   RelValueConvergence 1.000000e-008
   MaxTimeStep         360.000000
   MinTimeStep         1.000000e-002
   UseLightTimeDelay   Yes
    DetectEventsUsingSamplesOnly No
    Object  Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6
    Object  Satellite/700km_70deg_p1_1/Receiver/adsb_satrcvr2
    Object  Satellite/700km_70deg_p1_1/Transmitter/Cubesat_ADSB_5W5
    Object  Facility/Heathrow/Receiver/ADSB_GndRcvr11
   SaveMode    1
BEGIN StrandAccesses

  Strand    Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6 To Satellite/700km_70deg_p1_1/Receiver/adsb_satrcvr2 To Satellite/700km_70deg_p1_1/Transmitter/Cubesat_ADSB_5W5 To Facility/Heathrow/Receiver/ADSB_GndRcvr11
    Start    1195.0642378149812
    Stop     1835.1455090679565
    Start    7340.0578036164661
    Stop     7894.3992517002371
    Start    13416.738187351073
    Stop     13806.298240777975
    Start    19498.557815289918
    Stop     19705.173102091514
    Start    65818.053517377411
    Stop     66454.324395287491
    Start    71672.180692519469
    Stop     72547.094066864345
    Start    77833.977432603599
    Stop     78619.348877545111
    Start    84092.182681484614
    Stop     84561.237156648538
    Start    90288.013718123315
    Stop     90432.455643313762
    Start    191508.85867684081
    Stop     191759.36960056759
    Start    262299.72644194256
    Stop     262509.51768581249
    Start    268388.34132073121
    Stop     268834.82774799678
    Start    274461.37549446337
    Stop     275190.5383576476
    Start    280608.90321526298
    Stop     281153.49199052859
    Start    339005.42121854518
    Stop     339618.60222757503
    Start    345234.44020656409
    Stop     345859.08235539147
    Start    351353.28336688655
    Stop     352146.56221984047
    Start    357424.85780735587
    Stop     358089.00294254581
    Start    363521.33796658029
    Stop     363982.11329258879
    Start    415689.30195754464
    Stop     416555.06267034065
END StrandAccesses

   UseLoadIntervalFile    No

END Definition

BEGIN Extensions
    
    BEGIN Graphics

BEGIN Attributes

StaticColor					#ff00ff
AnimationColor					#ffff00
AnimationLineWidth					2.000000
StaticLineWidth					3.000000

END Attributes

BEGIN Graphics
    ShowGfx                Off
    ShowStatic             Off
    ShowAnimationHighlight On
    ShowAnimationLine      On
    ShowLinkDirection      Off
END Graphics
    END Graphics
    
    BEGIN ADFFileData
    END ADFFileData
    
    BEGIN Desc
    END Desc
    
    BEGIN Crdn
    END Crdn
    
    BEGIN VO
    END VO

END Extensions

END Chain

